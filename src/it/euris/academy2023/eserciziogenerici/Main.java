package it.euris.academy2023.eserciziogenerici;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Libreria<Media> libreria = new Libreria();

        LibreriaGestione libreriaGestione = new LibreriaGestione(libreria);


        Libro libro1 = new Libro("Harry Potter");
        libreria.getListaMedia().add(libro1);
        Libro libro2 = new Libro("Come uccidono le brave ragazze");
        libreria.getListaMedia().add(libro2);
        libreria.getListaMedia().add(new Rivista("National Geographic"));



        Scanner input = new Scanner(System.in);
        System.out.println("inserisci i/(l, v, m, r)-TITOLO per inserire o r per richiedere /(l, v, m, r)-TITOLO ");
        String inputValue = input.nextLine();

        String comando = inputValue.substring(0, inputValue.indexOf("/"));
        String tipoMedia = inputValue.substring(inputValue.indexOf("/") + 1, inputValue.indexOf("-"));
        String titoloMedia = inputValue.substring(inputValue.indexOf("-") + 1, inputValue.length());

        libreriaGestione.gestione(comando, tipoMedia, titoloMedia);

    }
}
