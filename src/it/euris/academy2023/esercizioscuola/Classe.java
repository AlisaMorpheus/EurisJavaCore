package it.euris.academy2023.esercizioscuola;

import java.util.ArrayList;
import java.util.List;

public class Classe {

    // Classi--> List<Studenti> e List<Professori>
    // e nome
    // (NUM MAX PERSONE ==5)
    private String nomeClasse;
    private List<Studente> listaStudenti = new ArrayList<>();
    private List<Professore> listaProfessori = new ArrayList<>();
    private final int nMax = 5;

    public Classe(String nomeClasse, List<Studente> listaStudenti, List<Professore> listaProfessori) {
        this.nomeClasse = nomeClasse;
        this.listaStudenti = listaStudenti;
        this.listaProfessori = listaProfessori;
    }

    public Classe() {
    }

    public Classe(String nomeClasse){
        this.nomeClasse = nomeClasse;
    }

    public String getNomeClasse() {
        return nomeClasse;
    }

    public void setNomeClasse(String nomeClasse) {
        this.nomeClasse = nomeClasse;
    }

    public List<Studente> getListaStudenti() {
        return listaStudenti;
    }

    public void setListaStudenti(List<Studente> listaStudenti) {
        this.listaStudenti = listaStudenti;
    }

    public List<Professore> getListaProfessori() {
        return listaProfessori;
    }

    public void setListaProfessori(List<Professore> listaProfessori) {
        this.listaProfessori = listaProfessori;
    }

    public int getnMax() {
        return nMax;
    }

    @Override
    public String toString() {
        return "Classe{" +
                "nomeClasse='" + nomeClasse + '\'' +
                ", listaStudenti=" + listaStudenti +
                ", listaProfessori=" + listaProfessori +
                '}';
    }
}
