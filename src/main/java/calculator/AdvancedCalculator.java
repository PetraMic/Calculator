package calculator;

import calculator.operations.Division;
import calculator.operations.Multiplication;
import calculator.operations.Operation;

public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        operations.put(ArithmeticOperator.MULTIPLICATION, new Multiplication());
        operations.put(ArithmeticOperator.DIVISION, new Division());
    }

    @Override
    public String calculate(ArithmeticOperator operator, double a, double b) {
        Operation operation = operations.get(operator);
        if (operation == null) {
            throw new IllegalArgumentException("Operation not supported");
        }
        return operation.calculate(a, b);
    }
}
