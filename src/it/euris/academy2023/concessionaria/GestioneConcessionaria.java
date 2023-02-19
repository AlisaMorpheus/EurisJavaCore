package it.euris.academy2023.concessionaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class GestioneConcessionaria {
    List<Concessionaria> concessionarias = new ArrayList<>();
    public GestioneConcessionaria(List<Concessionaria> concessionarias) {
        this.concessionarias = concessionarias;
    }
    public void gestione(String s) {
    }
    public void ricercaAuto(String nextLine) throws MacchinaNonTrovataException {
        List<EntryVeicolo> con = concessionarias.stream()
                .flatMap(concessionaria -> concessionaria.getVeicoli().stream())
                .filter(entryVeicolo -> entryVeicolo.getVeicolo().getNome().equals(nextLine))
                .collect(Collectors.toList());
        if (con.isEmpty()) {
            throw new MacchinaNonTrovataException("Veicolo non trovato");
        } else {
            for (Concessionaria c : concessionarias) {
                for (EntryVeicolo e : c.getVeicoli()) {
                    if (con.contains(e)) {
                        System.out.println(c.getName() + " " + e.getQuantita() + " " + e.getPrezzo());
                    }
                }
            }
        }
    }

    public void acquistoAuto(String autoCercata, int qnt, String nomeConc) throws QuantitaNonDisponibileException {
        Optional<Concessionaria> conc = concessionarias.stream().filter(concessionaria -> concessionaria.getName().equals(nomeConc)).findFirst();

        if (conc.isPresent()){
            for (EntryVeicolo entryVeicolo : conc.get().getVeicoli()){
                if (entryVeicolo.getVeicolo().getNome().equals(autoCercata)){
                    if (entryVeicolo.getQuantita()-qnt < 0){
                        throw new QuantitaNonDisponibileException("quantita non dispobibile");
                    }else if(entryVeicolo.getQuantita()-qnt == 0){
                        conc.get().getVeicoli().remove(entryVeicolo);
                        System.out.println("hai aquistato e il veicolo è sold-out");
                        break;
                    }else{
                        entryVeicolo.setQuantita(entryVeicolo.getQuantita()-qnt);
                        System.out.println("hai acquistato e ora sono disponibili veicoli: " + entryVeicolo.getQuantita());
                    }
                }
            }
        }
    }
}
