package it.euris.academy2023.eserciziogenerici;

import org.omg.CORBA.PUBLIC_MEMBER;

public abstract class Media {

    String titolo;

    public Media(String titolo) {
        this.titolo = titolo;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }


}
