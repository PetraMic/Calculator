package calculator;

import calculator.operations.Division;
import calculator.operations.Multiplication;

public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        operations.put(ArithmeticOperator.MULTIPLICATION, new Multiplication());
        operations.put(ArithmeticOperator.DIVISION, new Division());
    }
}
