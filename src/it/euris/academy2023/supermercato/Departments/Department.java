package it.euris.academy2023.supermercato.Departments;

import Products.Product;
import Supermarkets.Supermarket;

import java.util.List;

public abstract class Department {
    private List<Product> productList;
    private Supermarket supermarket;

    public Department(List<Product> productList) {
        this.productList = productList;
    }

    public abstract DepartmentType getDepartmentType();

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Supermarket getSupermarket() {
        return supermarket;
    }

    public void setSupermarket(Supermarket supermarket) {
        this.supermarket = supermarket;
    }

    @Override
    public String toString() {
        return "products list: \n" + productList.toString();
    }
}
