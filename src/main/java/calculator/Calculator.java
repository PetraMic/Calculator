package calculator;

import calculator.operations.Operation;

import java.util.HashMap;
import java.util.Map;

public abstract class Calculator {
    public Map<ArithmeticOperator, Operation> operations = new HashMap<>();

    public abstract String calculate(ArithmeticOperator operator, double a, double b);
}
