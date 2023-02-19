package it.euris.academy2023.concessionaria;

public class MacchinaNonTrovataException extends Exception{
    public MacchinaNonTrovataException(String message){
        super(message);
    }
}
