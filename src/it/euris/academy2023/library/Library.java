package it.euris.academy2023.library;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Library {

    private List<Book> library = new ArrayList<>();

    public void addBook(Book b) {
        library.add(b);
    }

    //Aggiunge un nuovo libro ad una array list (variabile di istanza)
    public void printAll() {
        for (int i = 0; i < library.size(); i++) {
            System.out.println(library.get(i));
        }
    }

    //Va in loop sulla lista di libri e stampa ognuno di essi
    public void sort() {
    library.sort(new Comparator<Book>() {
        @Override
        public int compare(Book o1, Book o2) {
            return o1.getYear() - o2.getYear();
        }
    });
    }
    //compara

}
