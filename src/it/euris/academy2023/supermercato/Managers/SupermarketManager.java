package it.euris.academy2023.supermercato.Managers;

import Products.Product;
import Supermarkets.Supermarket;

import java.util.List;
import java.util.stream.Collectors;

public class SupermarketManager {
    List<Supermarket> supermarketList;

    public SupermarketManager(List<Supermarket> supermarketList) {
        this.supermarketList = supermarketList;
    }

    //1) RICERCARE UN PRODOTTO E VEDERE IN QUALI SUPERMERCATI è PRESENTE
    public List<Supermarket> findProductWithSupermarket(String searchedProduct){
        return
        supermarketList.stream().filter(supermarket -> supermarket.getDepartments().stream()
                .anyMatch(department -> department.getProductList()
                        .stream().anyMatch(product -> product.getProductName().equals(searchedProduct))))
                .collect(Collectors.toList());
    }

    //  1.1) RICERCARE UN PRODOTTO IN UN CERTO SUPERMERCATO
    public boolean findProductInSupermarket(String searchedSupermarket, String searchedProduct){
                Supermarket supermarketF = supermarketList.stream().filter(supermarket -> searchedSupermarket.equals(supermarket.getsName()))
                        .findAny().orElseThrow(()->new RuntimeException());
        /*Optional<Supermarket> supermarketF2 = supermarketList.stream().filter(supermarket -> searchedSupermarket.equals(supermarket.getsName()))
                .findAny();
        if (!supermarketF2.isPresent()){
            throw new RuntimeException();
        }
        Supermarket supermarketX = supermarketF2.get(); */
        /*List<Supermarket> supermarketY = supermarketList.stream().filter(supermarket -> searchedSupermarket.equals(supermarket.getsName()))
                .collect(Collectors.toList());
        if(supermarketY.isEmpty()){
            throw new RuntimeException();
        }
        Supermarket supermarketY2 = supermarketY.get(0);*/
        return supermarketF.getDepartments().stream()
                .flatMap(department -> department.getProductList().stream())
                .anyMatch(product -> product.getProductName().equals(searchedProduct));
    }
    
//  1.2) STAMPARE TUTTI I PRODOTTI PRESENTI IN UN CERTO SUPERMERCATO
    public void printAllProductsInSupermarket(String searchedSupermarket){
         supermarketList.stream().filter(supermarket -> searchedSupermarket.equals(supermarket.getsName()))
                .findAny().orElseThrow(()->new RuntimeException()).getDepartments().stream()
                 .flatMap(department -> department.getProductList().stream())
                 .map(Product::toString)//(product-> product.toString())
                 .forEach(System.out::println); //methodref
                 //.forEach(product -> System.out.println(product.toString()));
    }

    //  1.3) RICERCARE SE UN REPARTO è PRESENTE IN UN CERTO SUPERMERCATO


    // USARE TOSTRING() PER STAMPARE LE INFO DEI PRODOTTI
}
