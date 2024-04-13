package calculator;

import calculator.operations.Operation;

import java.util.HashMap;
import java.util.Map;

public abstract class Calculator {
    double calculate;
    Map<Character, Operation> operations = new HashMap<>();
}
