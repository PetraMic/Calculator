package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator basicCalculator = new BasicCalculator();
        Calculator advancedCalculator = new AdvancedCalculator();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write number, then type of operation (+, -, *, /), then number again or 'exit' to quit");
            String line = scanner.nextLine().replaceAll("\\s+", "");

            if (line.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                ArithmeticOperator operation = null;
                for (ArithmeticOperator op : ArithmeticOperator.values()) {
                    if (line.contains(String.valueOf(op.getSymbol()))) {
                        operation = op;
                        break;
                    }
                }

                if (operation == null) {
                    System.out.println("Invalid input, try again");
                    continue;
                }

                String[] inputs = line.split("\\Q" + operation.getSymbol() + "\\E");
                if (inputs.length < 2) {
                    System.out.println("Invalid input, try again");
                    continue;
                }

                double a = Double.parseDouble(inputs[0]);
                double b = Double.parseDouble(inputs[1]);

                if (basicCalculator.operations.containsKey(operation)) {
                    System.out.println(basicCalculator.operations.get(operation).calculate(a, b));
                } else if (advancedCalculator.operations.containsKey(operation)) {
                    System.out.println(advancedCalculator.operations.get(operation).calculate(a, b));
                } else {
                    System.out.println("Operation not supported");
                }
            } catch (InputMismatchException | IllegalArgumentException e) {
                System.out.println("Invalid input, try again");
            }
        }
    }
}