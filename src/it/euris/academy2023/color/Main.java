package it.euris.academy2023.color;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*Implementare in Java una classe generica per gestire una  coppia di oggetti (anche di tipo diverso) colorati
          La classe espone i seguenti metodi:
          Costruttore: prende in input i due oggetti
          coloraTutti(Color c): setta il colore di tutti gli oggetti a c

          Come imporre che gli oggetti siano colorabili? */
        Sedia sedia1=new Sedia();
        Sedia sedia2=new Sedia();

        Coppia<Sedia> sediaCoppia=new Coppia<>(sedia1,sedia2);
        Color color=new Color("GIALLO");

        sediaCoppia.coloraTutti(color);

    }
}