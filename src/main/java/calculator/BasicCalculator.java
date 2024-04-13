package calculator;

import calculator.operations.Addition;
import calculator.operations.Subtraction;

public class BasicCalculator extends Calculator {
    public BasicCalculator() {
        operations.put('+', new Addition());
        operations.put('-', new Subtraction());
    }
}
