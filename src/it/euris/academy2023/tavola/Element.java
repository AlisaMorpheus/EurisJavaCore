package it.euris.academy2023.tavola;

public class Element {
    //Creare una classe che rappresenta un elemento sulla tavola periodica,
    // definito da nome, numero atomico, simbolo e massa atomica.
    //Creare i metodi getter e setter (metodi di accesso alle variabili di istanza)
    // e ridefinire i metodi equals e toString opportunamente.

    //var declaration
    private String name;
    private int atomNum;
    private String symb;
    private float atomMass;

    //"full" constructor
    public Element(String name, int atomNum, String symb, float atomMass) {
        this.name = name;
        this.atomNum = atomNum;
        this.symb = symb;
        this.atomMass = atomMass;
    }

    //empty constructor
    public Element() {

    }

    //to string
    @Override
    public String toString() {
        return "Element name= " + name +
                "; \nAtomic number= " + atomNum +
                "; \nChemical symbol= " + symb +
                "; \nAtomic Mass= " + atomMass + " g.\n";
    }

    //equals ?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; //controllo se elemento è uguale a se stesso
        if (!(o instanceof Element)) return false; // controllo se obj che passo è istanza della stessa classe
        Element e = (Element) o; //controllo effettivo
        return this.name.equals(e.name) && this.atomNum == e.atomNum;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAtomNum() {
        return atomNum;
    }

    public void setAtomNum(int atomNum) {
        this.atomNum = atomNum;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }

    public float getAtomMass() {
        return atomMass;
    }

    public void setAtomMass(float atomMass) {
        this.atomMass = atomMass;
    }
}


