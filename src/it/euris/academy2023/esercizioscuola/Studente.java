package it.euris.academy2023.esercizioscuola;

public class Studente extends Persona{

    public Studente(String nome, String cognome, int eta, String id) {
        super(nome, cognome, eta, id);
    }

    @Override
    public String toString() {
        return "Studente: \n " + super.toString()+ "-------------------\n";
    }
}
