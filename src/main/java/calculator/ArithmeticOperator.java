package calculator;

import calculator.operations.*;
import lombok.Getter;

public enum ArithmeticOperator {
    ADDITION('+', new Addition()),
    SUBTRACTION('-', new Subtraction()),
    MULTIPLICATION('*', new Multiplication()),
    DIVISION('/', new Division());


    @Getter
    private final char symbol;
    private final Operation operation;

    ArithmeticOperator(char symbol, Operation operation) {
        this.symbol = symbol;
        this.operation = operation;
    }

    public String calculate(double a, double b) {
        return operation.calculate(a, b);
    }

    public static ArithmeticOperator fromSymbol(String line) {
        if (line.length() == 1) {
            for (ArithmeticOperator operator : ArithmeticOperator.values()) {
                if (operator.symbol == line.charAt(0)) {
                    return operator;
                }
            }
        }
        throw new IllegalArgumentException("Unknown operator");
    }
}
