package it.euris.academy2023.esercizioscuola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// Scuola --> List<Classi>
        // Persone --> Studenti,Professori
        // Classi--> List<Studenti> e List<Professori> e nome (NUM MAX PERSONE ==5)

        // Utente può eseguire operazioni:
        // -inserire uno studente in una class (insertS)
        // -può leggere una persona dato un nome (readP)
        // -può contare quante persone ha una certa classe (countP)

        // gestire tutte le eccezioni
        // es: commando inesistente
        // es: num max persone nella classe
        // es: persona non presente

        // EXIT per uscire dal programma
        Scuola hogwarts = new Scuola();
        Classe grifondoro = new Classe("Grifondoro");
        Classe serpeverde = new Classe("Serpeverde");
        Classe tassorosso = new Classe("Tassorosso");
        Classe corvonero = new Classe("Corvonero");

        hogwarts.getListaClassi().add(grifondoro);
        hogwarts.getListaClassi().add(serpeverde);
        hogwarts.getListaClassi().add(tassorosso);
        hogwarts.getListaClassi().add(corvonero);


        Studente s1 = new Studente("Harry", "Potter", 15, "HP1");
        Studente s2 = new Studente("Hermione", "Granger", 15, "HG1");
        Studente s3 = new Studente("Ronald", "Weasley", 15, "RW1");
        Studente s4 = new Studente("Draco", "Malfoy", 14, "DM2");
        Studente s5 = new Studente("Pansy", "Parkinson", 15, "PP1");

        Professore p1 = new Professore("Minerva", "McGrannit", 80, "MM1");
        Professore p2 = new Professore("Albus Percival Wulfric Brian", "Silente", 150, "AS1");
        Professore p3 = new Professore("Severus", "Piton", 50, "SP1");
        Professore p4 = new Professore("Rubeus", "Hagrid", 51, "RH1");

        //grifondoro add
        grifondoro.getListaProfessori().add(p1);
        grifondoro.getListaProfessori().add(p2);
        grifondoro.getListaStudenti().add(s1);
        grifondoro.getListaStudenti().add(s2);
        grifondoro.getListaStudenti().add(s3);
        //serpeverde add
        serpeverde.getListaProfessori().add(p3);
        serpeverde.getListaStudenti().add(s4);
        serpeverde.getListaStudenti().add(s5);

        //System.out.println(serpeverde);

        Boolean continua = true;
        while (continua) {
            Scanner input = new Scanner(System.in);
            System.out.println("Inserisci: \n " +
                    "I per inserire uno studente;\n " +
                    "R per leggere i dettagli di uno studente; \n" +
                    "C per contare le persone in una classe; \n" +
                    "EXIT per terminare il programma. \n");
            String inputValue = input.nextLine();

            switch (inputValue) {
                case "I":
                    System.out.println("Scrivi il nome dello studente da inserire");
                    break;
                case "R":
                    System.out.println("Scrivi il nome della persona di cui vuoi le info\n");
                    String nomeCercato = input.nextLine();


                    break;
                case "C":
                    System.out.println("Scrivi il nom della classe di cui vuoi sapere il numero \n");
                    break;
                case "EXIT":
                    System.out.println("Ciao!\n");
                    continua = false;
                    break;
                default:
                    System.out.println("Selezionare un'opzione valida\n");
            }

        }
    }
}
