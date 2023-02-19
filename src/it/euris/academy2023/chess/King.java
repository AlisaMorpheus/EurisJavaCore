package it.euris.academy2023.chess;

public class King extends Piece {
    public King(int x, int y) {
        super(x, y);
    }

    @Override
    protected boolean validate(int nextX, int nextY) {
        if ((Math.pow(nextX - this.x,2) +Math.pow(nextY - this.y,2) )<=2) {
            return true;
        }
        /*if (Math.abs((nextX - this.x))==1 && Math.abs((nextY - this.y))==1) {
            return true;
        }//diagonali
        //if (Math.abs((nextX - this.x))==1 || Math.abs((nextY - this.y))==1) {
            return true;
        }//assi*/
        return false;
    }
}
