package it.euris.academy2023.eserciziogenerici;

import java.util.ArrayList;
import java.util.List;

public class Libreria <T>{ //la libreria gestisce oggetti di tipo t, generico
    //solo quando creo la lib decido cosa tratta

    //dev'essere la classe coi generics, media è la superclass
    private List<T> listaMedia = new ArrayList<>();

    public Libreria() {
    }

    public Libreria(List<T> listaMedia) {
        this.listaMedia = listaMedia;
    }

    public List<T> getListaMedia() {
        return listaMedia;
    }

    public void setListaMedia(List<T> listaMedia) {
        this.listaMedia = listaMedia;
    }

}
