package it.euris.academy2023.lambda;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Product {
    private String name;
    private float price;
    private int amount;
    private boolean salable;

    public Product(String name, float price, int amount, boolean salable) {
        this.name = name;
        this.price = price;
        this.amount = amount;
        this.salable = salable;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public boolean isSalable() {
        return salable;
    }

    public void setSalable(boolean salable) {
        this.salable = salable;
    }

    public static void main(String[] args) {
        /*List<Product> store = new ArrayList<>();
        //popolare lista
        Product p1 = new Product ("mela", 0.25f, 25, true);
        Product p2 = new Product ("pera", 0.20f, 20, true);
        Product p3 = new Product ("maracuja", 1.25f, 40, false);
        Product p4 = new Product ("litchee", 1.25f, 10, true);
        Product p5 = new Product ("arancia", 0.50f, 30, true);
        /*
        scrivere lambda che va a calcolare l'importo totale di tutti
        i prodotti vendibili presenti nello store --> tener presente prodotti vendibili
        --> considerare anche quantità dei prodotti disponibili
         */

        List<Product> products = new ArrayList<>();

        products.add(new Product("TV", 1000, 10, true));
        products.add(new Product("Tablet", 200, 7, true));
        products.add(new Product("Smartphone", 500, 17, true));
        products.add(new Product("Estintore", 100, 2, false));

        Optional<Float> sum = products.stream().filter(product -> product.isSalable())//filtro su salable
                .map(product -> product.getAmount() * product.getPrice()) //mappo
                .reduce((accumulator, currentValue) -> accumulator + currentValue); //operazione d'accumulo
        if (sum.isPresent()) {
            System.out.println(sum.get());
        }


    }
}
