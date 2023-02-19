package it.euris.academy2023.ristorante;

import java.util.ArrayList;
import java.util.HashMap;

public class Menu {
    ArrayList<Food> cibi = new ArrayList<>();
    ArrayList<Drink> bevande = new ArrayList<>();


    public Menu(ArrayList<Food> cibi, ArrayList<Drink> bevande) {
        this.cibi = cibi;
        this.bevande = bevande;
    }

    public Menu() {

    }

    public ArrayList<Food> getCibi() {
        return cibi;
    }

    public void setCibi(ArrayList<Food> cibi) {
        this.cibi = cibi;
    }

    public ArrayList<Drink> getBevande() {
        return bevande;
    }

    public void setBevande(ArrayList<Drink> bevande) {
        this.bevande = bevande;
    }
}
