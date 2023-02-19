package it.euris.academy2023.concessionaria;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {
    private String name;
    List<EntryVeicolo> veicoli = new ArrayList<>();

    public Concessionaria(){};

    public Concessionaria(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EntryVeicolo> getVeicoli() {
        return veicoli;
    }

    public void setVeicoli(List<EntryVeicolo> veicoli) {
        this.veicoli = veicoli;
    }

    public void addEntryVeicolo(EntryVeicolo e){
        this.veicoli.add(e);
    }
}
