package calculator;

import calculator.operations.Addition;
import calculator.operations.Operation;
import calculator.operations.Subtraction;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {
        operations.put(ArithmeticOperator.ADDITION, new Addition());
        operations.put(ArithmeticOperator.SUBTRACTION, new Subtraction());
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
