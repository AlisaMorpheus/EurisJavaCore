package it.euris.academy2023.calculator;

public class CalculationEngineImpl implements CalculationEngine{
    @Override
    public float add(float a, float b) {
        return a + b;
    }

    @Override
    public float sub(float a, float b) {
        return a - b;
    }

    @Override
    public float mult(float a, float b) {
        return a * b;
    }

    @Override
    public float div(float a, float b) {
        return a / b;
    }
}
