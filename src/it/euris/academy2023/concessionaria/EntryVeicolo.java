package it.euris.academy2023.concessionaria;

public class EntryVeicolo {
    private String prezzo;
    private int quantita;
    private Veicolo veicolo;

    public EntryVeicolo(String prezzo, int quantita, Veicolo veicolo) {
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.veicolo = veicolo;
    }

    public String getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(String prezzo) {
        this.prezzo = prezzo;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public Veicolo getVeicolo() {
        return veicolo;
    }

    public void setVeicolo(Veicolo veicolo) {
        this.veicolo = veicolo;
    }
}
