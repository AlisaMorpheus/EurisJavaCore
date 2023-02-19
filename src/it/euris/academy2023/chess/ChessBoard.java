package it.euris.academy2023.chess;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class ChessBoard {

    Map<Piece, Behavior> map = new LinkedHashMap<>();

    // aggiungere ad una mappa Map<Piece, Behaviour i vari pezze i il comportamento da simulare
    public void add(Piece p, Behavior b) {
        map.putIfAbsent(p, b);

    }

    public void startGame() {
        for (Piece p : map.keySet()) {
            boolean result = map.get(p).simulate(p);
            if (result) {
                System.out.println("Mossa valida,");
            }// nuova posizione: ("+p.getx +"," + this.y +")");}
            else {
                System.out.println("Mossa non valida");
            }
        }
    }

}

