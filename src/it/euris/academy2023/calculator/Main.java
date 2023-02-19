package it.euris.academy2023.calculator;

public class Main {
    public static void main(String[] args) {

        //public void setEngine(CalculationEngine engine) {}
        Calculator c = new Calculator();
        CalculationEngine engine = new CalculationEngineImpl();
        c.setEngine(engine);

        float a = 6;
        float b = 3;

        c.add(a, b);
        c.sub(a, b);
        c.mult(a, b);
        c.div(a, b);
    }
}
