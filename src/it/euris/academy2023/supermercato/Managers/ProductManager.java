package it.euris.academy2023.supermercato.Managers;

import Products.Product;

import java.util.List;

public class ProductManager {
    //lista di prodotti
    private List<Product> productList;
    //constructor
    public ProductManager(List<Product> productList) {
        this.productList = productList;
    }


}
