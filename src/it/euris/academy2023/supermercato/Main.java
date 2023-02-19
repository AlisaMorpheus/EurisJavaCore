package it.euris.academy2023.supermercato;

import Departments.*;
import Managers.SupermarketManager;
import Products.Product;
import Products.ProductType;
import Supermarkets.Supermarket;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //AL
        List<Product> productList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        List<Supermarket> supermarketList = new ArrayList<>();
        //Depts
        BeverageDept beverageDept = new BeverageDept(productList);
        FoodDept foodDept = new FoodDept(productList);
        FrozenFoodDept frozenFoodDept = new FrozenFoodDept(productList);
        HomePersonalDept homePersonalDept = new HomePersonalDept(productList);
        ProduceDept produceDept = new ProduceDept(productList);
        //Products
        Product mela1 = new Product("Mela Melinda", ProductType.FRUITS, 0.2d, 200, produceDept);
        Product insalata1 = new Product("Insalata Iceberg", ProductType.VEGETABLES, 0.4d, 100, produceDept);
        Product deodoroante1 = new Product("Deodorante Nivea", ProductType.PERSONALCARE, 2.5d, 20, homePersonalDept);
        Product detersivo1 = new Product("Marsiglia liquido", ProductType.HOMECLEANING, 2.7d, 15, homePersonalDept);
        Product surgelato1 = new Product("Spinaci surgelati", ProductType.FROZENFOOD, 1.5d, 10, frozenFoodDept);
        Product bevanda1 = new Product("CocaCola", ProductType.DRINKS, 2.00d, 40, beverageDept);
        Product carne1 = new Product("Fesa di tacchino",  ProductType.MEAT, 3.00d, 3, foodDept);
        Product cibo1 = new Product("Fusilli", ProductType.FOOD, 1.00d, 45, foodDept);
        //P adds
        productList.add(mela1);
        productList.add(insalata1);
        productList.add(deodoroante1);
        productList.add(detersivo1);
        productList.add(surgelato1);
        productList.add(bevanda1);
        productList.add(carne1);
        productList.add(cibo1);
        //Depts add
        departmentList.add(beverageDept);
        departmentList.add(foodDept);
        departmentList.add(frozenFoodDept);
        departmentList.add(homePersonalDept);
        departmentList.add(produceDept);
        //sm creation
        Supermarket supermarket1 = new Supermarket("Esselunga", 10000, departmentList);
        beverageDept.setSupermarket(supermarket1);
        foodDept.setSupermarket(supermarket1);
        frozenFoodDept.setSupermarket(supermarket1);
        homePersonalDept.setSupermarket(supermarket1);
        produceDept.setSupermarket(supermarket1);
        supermarketList.add(supermarket1);

        SupermarketManager supermarketManager = new SupermarketManager(supermarketList);
        String searchedProduct = "Fusilli";
        System.out.println(supermarketManager.findProductWithSupermarket(searchedProduct));
    }
}
