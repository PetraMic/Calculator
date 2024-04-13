package calculator.operations;

public class Addition implements Operation {

    @Override
    public String calculate(double a, double b) {
        return "BasicCalculator calculated result: " + (a + b);
    }
}
