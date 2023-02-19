package it.euris.academy2023.calculator;

public class Calculator {

    private CalculationEngine engine; //lo passo per consentire implem altri metodi
    public Calculator() {

    }
    public void setEngine(CalculationEngine engine) {
        this.engine = engine;
    } //ho un engine a disposizione che mi permette di implementare



    public void add(float a, float b) {
        float result = this.engine.add(a, b);
        System.out.println(result);
    }

    public void sub(float a, float b) {
        float result = this.engine.sub(a, b); //non calcolo l'addizione direttamente ma la calcola l'implementazione
        System.out.println(result);
    }

    public void mult(float a, float b) {
        float result = this.engine.mult(a, b);
        System.out.println(result);
    }

    public void div(float a, float b) {
        if (b != 0) {
            float result = this.engine.div(a, b);
            System.out.println(result);
        } else System.out.println("Impossibile eseguire la divisione");
    }

}
