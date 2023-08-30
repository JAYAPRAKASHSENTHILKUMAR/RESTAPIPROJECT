package com.example.Model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Appliance
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int productId;
    private String brand;
    private String productName;
    private int warrantyStartDate;
    private int warrantyEndDate;
    private String problem;
    private int mobilenumber;

  @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

        // ...
    public Appliance(String name, int productId, String brand, String productName, int warrantyStartDate, int warrantyEndDate, String problem,int clientId,int mobilenumber) {
        this.name = name; 
        this.productId = productId;
        this.brand = brand;
        this.productName = productName;
        this.warrantyStartDate = warrantyStartDate;
        this.warrantyEndDate = warrantyEndDate;
        this.problem = problem;
        this.mobilenumber =mobilenumber;
        
    }

    // Getters and setters for all fields

    public Long getClientId() {
        return id;
    }

    public void setClientId(Long clientId) {
        this.id =clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getWarrantyStartDate() {
        return warrantyStartDate;
    }

    public void setWarrantyStartDate(int warrantyStartDate) {
        this.warrantyStartDate = warrantyStartDate;
    }

    public int getWarrantyEndDate() {
        return warrantyEndDate;
    }

    public void setWarrantyEndDate(int warrantyEndDate) {
        this.warrantyEndDate = warrantyEndDate;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }
    
    public int getMobilenumber() {
    	return mobilenumber;
    }
    
    public void setMobileNumber(int mobilenumber) {
    	this.mobilenumber = mobilenumber;
    }
}

    
    
    
    // Add other fields as needed

    // Constructors, getters, setters

