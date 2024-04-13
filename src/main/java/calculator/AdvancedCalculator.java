package calculator;

import calculator.operations.Division;
import calculator.operations.Multiplication;

public class AdvancedCalculator extends Calculator {
    public AdvancedCalculator() {
        operations.put('*', new Multiplication());
        operations.put('/', new Division());
    }
}
