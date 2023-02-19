package it.euris.academy2023.esercizioscuola;

import java.util.ArrayList;
import java.util.List;

public class Scuola {
    private List<Classe> listaClassi = new ArrayList<>();

    public Scuola(List<Classe> listaClassi) {
        this.listaClassi = listaClassi;
    }

    public List<Classe> getListaClassi() {
        return listaClassi;
    }

    public void setListaClassi(List<Classe> listaClassi) {
        this.listaClassi = listaClassi;
    }

    public Scuola() {
    }

    //lista persone totali

}
