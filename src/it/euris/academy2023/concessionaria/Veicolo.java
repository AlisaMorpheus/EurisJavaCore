package it.euris.academy2023.concessionaria;

public abstract class Veicolo {
    private String nome;
    public Veicolo(){};

    public Veicolo(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

}
