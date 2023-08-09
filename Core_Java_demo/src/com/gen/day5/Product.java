package com.gen.day5;

class Product {
    private Long id;
    private String productName;
    private String supplierName;

    
    public Product() {
        this.supplierName = "Nivas";
    }

    
    public Product(Long id, String productName, String supplierName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = supplierName;
    }

    
    public Product(Long id, String productName) {
        this.id = id;
        this.productName = productName;
        this.supplierName = "Nivas";
    }

    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    
    public void display() {
        System.out.println("Product Id is " + id);
        System.out.println("Product Name is " + productName);
        System.out.println("Supplier Name is " + supplierName);
    }

    public static void main(String[] args) {
        
        Product product1 = new Product();
        product1.setId(1L);
        product1.setProductName("Printer");
        product1.display();

        
        Product product2 = new Product(1L, "Printer");
        product2.setSupplierName("HP");
        product2.display();
    }
}
