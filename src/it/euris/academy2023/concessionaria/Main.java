package it.euris.academy2023.concessionaria;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static <Stream> void main(String[] args) {
        /*Concessionaria
            -lista veicoli -> contatore per ogni veicolo
             -es: Macchina(count; name;)
            -file csv (OPZIONALE) di configurazione della concessionaria
        CONCESS;TIPO;NOME VEICOLO;QUANITà;PREZZO
        1)utente può:
            -login e logout--> login mi permette di eseguire comandi, logout mi richiede di fare un nuovo login
            -exit finale --> chiude l'applicazione
            -ricercare un veicolo nelle N concessionarie (ritorna anche quantità)
                -ok --> lista concess.
                -eccezione (veicolo non presente)

        -acquistare un veicolo, indicandone nome, la quantità, nome della concessionaria
        -ok
        --> diminuisco quantità nella concess.
        --> operazione andata a buon fine
        --> se count==0 elimino veicolo dalla concessionaria
        -eccezione (veicolo non presente, quantità non disponibile e conc. non presente*/

        Concessionaria concessionaria1 = new Concessionaria("PrimaConcessionaria");
        Concessionaria concessionaria2 = new Concessionaria("SecondaConcessionaria");
        Concessionaria concessionaria3 = new Concessionaria("TerzaConcessionaria");

        List<Concessionaria> concessionarias = new ArrayList<>();

        Macchina macchina1 = new Macchina("Toyota");
        Macchina macchina2 = new Macchina("Fiat");
        Macchina macchina3 = new Macchina("Ford");
        EntryVeicolo v1 = new EntryVeicolo("15.000", 8, macchina1);
        EntryVeicolo v7 = new EntryVeicolo("15.000", 8, macchina1);
        EntryVeicolo v2 = new EntryVeicolo("15.000", 10, macchina2);
        EntryVeicolo v3 = new EntryVeicolo("15.000", 6, macchina3);
        Moto moto1 = new Moto("Kawasaki");
        Moto moto2 = new Moto("Yamaha");
        Moto moto3 = new Moto("Ducati");
        EntryVeicolo v4 = new EntryVeicolo("15.000", 8, moto1);
        EntryVeicolo v5 = new EntryVeicolo("10.000", 20, moto1);
        EntryVeicolo v6 = new EntryVeicolo("8.000", 1, moto1);

        //CONCESSIONARIA 1
        concessionaria1.addEntryVeicolo(v1);
        concessionaria1.addEntryVeicolo(v6);
        concessionaria1.addEntryVeicolo(v3);
        //CONCESSIONARIA 2
        concessionaria2.addEntryVeicolo(v2);
        concessionaria2.addEntryVeicolo(v7);
        //CONCESSIONARIA 3
        concessionaria3.addEntryVeicolo(v4);
        concessionaria3.addEntryVeicolo(v5);

        concessionarias.add(concessionaria1);
        concessionarias.add(concessionaria2);
        concessionarias.add(concessionaria3);

        GestioneConcessionaria gestioneConcessionaria = new GestioneConcessionaria(concessionarias);

        Boolean operazione = true;

        while (operazione) {
            System.out.println("Come ti chiami?");
            Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            Boolean login = true;
            while (login) {
                System.out.println("Ciao " + name + ", cosa vuoi fare? \n" +
                        "1. Cercare un'auto \n" +
                        "2. Logout");
                String comando1 = input.nextLine();
                switch (comando1) {
                    case "1":
                        System.out.println("Dimmi il nome dell'auto che vuoi cercare:");
                        try {
                            String autoCercata = input.nextLine();
                            gestioneConcessionaria.ricercaAuto(autoCercata);
                            System.out.println("Indicami la quantita e la concessionaria, separate da '/' ");
                            String[] tokens = input.nextLine().split("/");
                            gestioneConcessionaria.acquistoAuto(autoCercata, Integer.parseInt(tokens[0]), tokens[1]);
                        }
                        catch (MacchinaNonTrovataException macchinaNonTrovataException){
                            System.out.println(macchinaNonTrovataException.getMessage());
                        }
                        catch (QuantitaNonDisponibileException quantitaNonDisponibileException){
                            System.out.println(quantitaNonDisponibileException.getMessage());
                        }
                        break;
                    case "2":
                        login = false;
                        break;
                    default:
                        System.out.println("Selezionare un'opzione valida :( ");
                }
            }
            System.out.println("Nuova operazione? (si/no)");
            if (input.nextLine().equals("no")){
                operazione = false;
            }
        }
    }
}

