package calculator.operations;

public class Division implements Operation {
    @Override
    public String calculate(double a, double b) {
        return "AdvancedCalculator calculated result: " + (a / b);
    }
}
