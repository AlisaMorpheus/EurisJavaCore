package it.euris.academy2023.chess;

public class Main {
    public static void main(String[] args) {

        Piece rook_wl = new Rook(0, 0);
        Piece bishop_wl = new Bishop(2, 0);
        Piece king_w = new King(4, 0);

        ChessBoard b = new ChessBoard();
        b.add(new Rook(7, 7), new Behavior() {
            @Override
            public boolean simulate(Piece p) {
                return p.move(7, 5) && p.move(5, 5);

            }
        });
        b.startGame();


        //if(rook_wl.move(3,0)){System.out.println("Mossa valida, nuova posizione: ("+this.x +"," + this.y +")");}

        rook_wl.move(3, 5);
        rook_wl.move(1, 5);

        bishop_wl.move(5, 3);
        bishop_wl.move(4, 4);
        bishop_wl.move(2, 6);

        king_w.move(4, 1);
        king_w.move(4, 2);
        king_w.move(5, 3);
        king_w.move(5, 7); //non valida

        //System.out.println(rook_wl.move(3,0));


    }
}