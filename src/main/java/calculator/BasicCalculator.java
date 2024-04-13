package calculator;

import calculator.operations.Addition;
import calculator.operations.Subtraction;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {
        operations.put(ArithmeticOperator.ADDITION, new Addition());
        operations.put(ArithmeticOperator.SUBTRACTION, new Subtraction());
    }
}
