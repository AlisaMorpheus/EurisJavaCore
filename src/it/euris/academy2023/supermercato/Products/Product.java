package it.euris.academy2023.supermercato.Products;

import Departments.Department;

public class Product {
    private String productName;
    private ProductType productType;
    private double productPrice;
    private Integer productStock;
    private Department department;

    //costruttore
    public Product(String productName, ProductType productType, double productPrice, Integer productStock, Department department) {
        this.productName = productName;
        this.productType = productType;
        this.productStock = productStock;
        this.productPrice = productPrice;
        this.department = department;
    }

    //getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Integer getProductStock() {
        return productStock;
    }

    public void setProductStock(Integer productStock) {
        this.productStock = productStock;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return productName +
                " a Euro" + productPrice +
                ", disponibili" + productStock +
                "pezzi, reparto" + department +
                "\n";
    }
}
