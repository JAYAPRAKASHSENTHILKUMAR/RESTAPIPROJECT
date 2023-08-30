package com.example.Controller;

import com.example.Model.Appliance;
import com.example.Repository.ApplianceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/appliances")
public class ApplianceController {
    @Autowired
    private ApplianceRepository applianceRepository;

    @GetMapping
    public ResponseEntity<List<Appliance>> getAllAppliances() {
        List<Appliance> appliances = applianceRepository.findAll();
        return ResponseEntity.ok(appliances);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Appliance> getApplianceById(@PathVariable Long id) {
        Optional<Appliance> appliance = applianceRepository.findById(id);
        return appliance.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<String> createAppliance(@RequestBody Appliance appliance) {
        Appliance savedAppliance = applianceRepository.save(appliance);
        if (savedAppliance != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body("The given data is successfully saved in the database");
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An error occurred while saving the data");
        }
    }


    @PutMapping("/{id}")
    public ResponseEntity<Appliance> updateAppliance(@PathVariable Long id, @RequestBody Appliance updatedAppliance) {
        Optional<Appliance> existingAppliance = applianceRepository.findById(id);
        if (existingAppliance.isPresent()) {
            updatedAppliance.setClientId(id);
            Appliance savedAppliance = applianceRepository.save(updatedAppliance);
            return ResponseEntity.ok(savedAppliance);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAppliance(@PathVariable Long id) {
        Optional<Appliance> existingAppliance = applianceRepository.findById(id);
        if (existingAppliance.isPresent()) {
            applianceRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
