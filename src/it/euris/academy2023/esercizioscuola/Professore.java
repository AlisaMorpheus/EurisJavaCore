package it.euris.academy2023.esercizioscuola;

public class Professore extends Persona{

    public Professore(String nome, String cognome, int eta, String id) {
        super(nome, cognome, eta, id);
    }

    @Override
    public String toString() {
        return "Professore: \n" + super.toString() + "-------------------\n";
    }
}
