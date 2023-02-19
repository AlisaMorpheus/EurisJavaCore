package it.euris.academy2023.chess;

public class Bishop extends Piece {
    public Bishop(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int nextX, int nextY) {
        if (Math.abs((nextX - this.x)) == Math.abs((nextY - this.y))) {
            return true;
        }
        return false;
    }
}
