package it.euris.academy2023.portfolio;

public enum TypeFinancialInstrument {
    EQY("Azioni"),
    FND("Fondi"),
    BND("Obbligazioni"),
    CC("Conti Correnti"),
    POL("Polizze");

    private String codice;

    TypeFinancialInstrument(String codice){
        this.codice = codice;
    }

    public String getCodice(){
        return this.getCodice();
    }

}