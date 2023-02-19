package it.euris.academy2023.chess;

import java.util.Objects;

public abstract class Piece {
    protected int x;
    protected int y;

    public Piece(int x, int y) {
        this.x = x;
        this.y = y;
    }

    protected abstract boolean validate(int nextX, int nextY);

    public final boolean move(int nextX, int nextY) {
        if ((0 > nextX || nextX > 7) || (0 > nextY || nextY < 7)) {
            return false;
        }
        if (!validate(nextX, nextY)) {
            return false;
        }
        this.x = nextX;
        this.y = nextY;
        System.out.println("La mossa è valida, la nuova posizione è x: " + x + " e y: " + y);
        return true;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Piece piece = (Piece) o;
        return x == piece.x && y == piece.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
