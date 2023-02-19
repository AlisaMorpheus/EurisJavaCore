package it.euris.academy2023.color;

public class Coppia<T extends Colorable> {

    private T t1;

    private T t2;

    Coppia(T t1,T t2){
        this.t1=t1;
        this.t2=t2;
    }

    public void coloraTutti(Color c){
        t1.setColor(c);
        t2.setColor(c);
    }

}
