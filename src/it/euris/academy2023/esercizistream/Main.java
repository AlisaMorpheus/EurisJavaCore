package it.euris.academy2023.esercizistream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        //stampare solo quelliche iniziano in a
        List<String> stringList=Arrays.asList("ciao","alberto","antonio","luca","gatto","animale");

        stringList.stream().filter(str -> str.startsWith("a")).forEach(str-> System.out.println(str));
        //posso collezionare lista
        stringList.stream().filter(str ->str.startsWith("a"))
                .collect(Collectors.toList());
        stringList.forEach(str -> System.out.println(str));
        //recupera il primo


        // cn lista di interi sommre interi maggiori di 5
        //stampare risultato
        List<Integer> listInteger = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Integer sum = listInteger.stream().filter(intero -> intero >5).collect(Collectors.summingInt(Integer :: intValue));
        System.out.println(sum);

        //es 3 da una lisa di stringhe vado a creare una nuova lista di oggetti (new List di persone o stud)
        //che all'interno contengono la singola stringa su variabile di classe nome
        List<String> nomiList=Arrays.asList("michael","alberto","antonio","luca","antonio","francesco");
        //List<Persona> persone = nomiList.stream().map(stringa -> new Persona(stringa)).collect(Collectors.toList());
        //posso trascrivere così perchè chiedo di trasformare in oggetto che accetta in questa Stringa
        List<Persona> persone = nomiList.stream().map(Persona::new).collect(Collectors.toList());
        //se non ho un costruttore e volessi avere la stringa dentro persona
        //List<Persona> persone = nomiList
        //          .stream()
        //              .map(stringa ->
        //              {Persona p = new Persona();
        //              p.setNome(stringa);
        //              return p;}}.collect(Collectors.toList());


    }

}
