package com.example.Controller;

import com.example.Model.Client;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private List<Client> clients = new ArrayList<>();
    private Long clientIdCounter = 1L;

    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return new ResponseEntity<>(clients, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        Optional<Client> optionalClient = clients.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst();
        
        return optionalClient.map(client -> new ResponseEntity<>(client, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Client> createClient(@RequestBody Client client) {
        client.setId(clientIdCounter++);
        clients.add(client);
        return new ResponseEntity<>(client, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
        Optional<Client> optionalClient = clients.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst();

        if (optionalClient.isPresent()) {
            Client client = optionalClient.get();
            client.setName(updatedClient.getName());
            client.setMobileNumber(updatedClient.getMobileNumber());
            return new ResponseEntity<>(client, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        Optional<Client> optionalClient = clients.stream()
                .filter(client -> client.getId().equals(id))
                .findFirst();

        if (optionalClient.isPresent()) {
            clients.remove(optionalClient.get());
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
