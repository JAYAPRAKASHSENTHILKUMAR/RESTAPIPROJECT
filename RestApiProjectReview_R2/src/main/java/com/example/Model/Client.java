package com.example.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long clientid;

    private String name;
    
    private int mobilenumber;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Appliance> appliances;


    // Constructors, getters, setters

    public Client() {
    }

    public Client(String name, List<Appliance> appliances) {
        this.name = name;
        this.appliances = appliances;
        
    }

    public Long getId() {
        return clientid;
    }

    public void setId(Long id) {
        this.clientid = id;
    }

    public String getName() {
        return name;
    }
    
 
    public void setName(String name) {
        this.name = name;
    }
    
    public int getMobileNumber() {
    	return mobilenumber;
    }
    
    public void setMobileNumber(int mobilenumber) {
    	this.mobilenumber =mobilenumber;
    }
    
    
    

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public void setAppliances(List<Appliance> appliances) {
        this.appliances = appliances;
    }
}
