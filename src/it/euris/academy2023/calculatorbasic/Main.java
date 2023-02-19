package it.euris.academy2023.calculatorbasic;

public class Main {
    public static void main(String[] args) {

        CalculatorBasic calculator = new CalculatorBasic();
        float a =6;
        float b= 3;
        calculator.add(a, b);
        calculator.sub(a, b);
        calculator.mult(a, b);
        calculator.div(a, b);
    }
}
