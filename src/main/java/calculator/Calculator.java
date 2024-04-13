package calculator;

import calculator.operations.Operation;

import java.util.HashMap;
import java.util.Map;

public abstract class Calculator {
    Map<ArithmeticOperator, Operation> operations = new HashMap<>();
}
