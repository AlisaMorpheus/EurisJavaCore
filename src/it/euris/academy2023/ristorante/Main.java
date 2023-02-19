package it.euris.academy2023.ristorante;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Food> cibi = new ArrayList<>();
        ArrayList<Drink> bevande = new ArrayList<>();

        cibi.add(new Food("carbonara", 15.99));
        cibi.add(new Food("amatriciana", 14.99));
        cibi.add(new Food("cotoletta", 10.99));

        bevande.add(new Drink("CocaCola", 4.55));


        Table tavolo1 = new Table(1,5);
        Table tavolo2 = new Table(2,4);
        Table tavolo3 = new Table(3,5);
        Table tavolo4 = new Table(4,6);

        Menu menuBase = new Menu();



        Food f1 = new Food("Carbonara", 15.99);
        Food f2 = new Food("Cotoletta", 10.99);
        Food f3 = new Food("Aatriciana", 11.99);
        Drink d1 = new Drink("Coca Cola", 3.50);
        Drink d2 = new Drink("Birra bionda", 4.50);
        Drink d3 = new Drink("Fanta", 3.50);


    }

}
