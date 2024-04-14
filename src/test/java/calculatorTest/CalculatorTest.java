package calculatorTest;

import calculator.AdvancedCalculator;
import calculator.ArithmeticOperator;
import calculator.BasicCalculator;
import calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final Calculator basicCalculator = new BasicCalculator();
    private final Calculator advancedCalculator = new AdvancedCalculator();
        @Test
    public void testBasicCalculatorAddition() {
            final ArithmeticOperator operator = ArithmeticOperator.ADDITION;
            final double expected = 3.0;
            final String result = basicCalculator.operations.get(operator).calculate(1, 2);
            Assertions.assertEquals("BasicCalculator calculated result: " + expected, result);
    }
    @Test
    public void testBasicCalculatorSubtraction() {
        final ArithmeticOperator operator = ArithmeticOperator.SUBTRACTION;
        final double expected = -1.0;
        final String result = basicCalculator.operations.get(operator).calculate(1, 2);
        Assertions.assertEquals("BasicCalculator calculated result: " + expected, result);
    }
    @Test
    public void testAdvancedCalculatorMultiplication() {
        final ArithmeticOperator operator = ArithmeticOperator.MULTIPLICATION;
        final double expected = 2.0;
        final String result = advancedCalculator.operations.get(operator).calculate(1, 2);
        Assertions.assertEquals("AdvancedCalculator calculated result: " + expected, result);
    }
    @Test
    public void testAdvancedCalculatorDivision() {
        final ArithmeticOperator operator = ArithmeticOperator.DIVISION;
        final double expected = 0.5;
        final String result = advancedCalculator.operations.get(operator).calculate(1, 2);
        Assertions.assertEquals("AdvancedCalculator calculated result: " + expected, result);
    }
    @Test
    public void testBasicCalculatorUnsupportedOperation() {
        final ArithmeticOperator operator = ArithmeticOperator.DIVISION;
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> basicCalculator.calculate(operator, 1, 2));
        assertEquals("Operation not supported", exception.getMessage());
    }
    @Test
    public void testAdvancedCalculatorUnsupportedOperation() {
        final ArithmeticOperator operator = ArithmeticOperator.ADDITION;
        final IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> advancedCalculator.calculate(operator, 1, 2));
        assertEquals("Operation not supported", exception.getMessage());
    }
}
