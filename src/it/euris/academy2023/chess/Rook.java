package it.euris.academy2023.chess;

public class Rook extends Piece {

    public Rook(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int nextX, int nextY) {
        if (Math.abs((nextX-this.x))>0 && Math.abs((nextY-this.y))>0) {
            return false;
        }
        return true;
    }
}
