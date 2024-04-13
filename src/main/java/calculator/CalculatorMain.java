package calculator;

import java.util.Scanner;

public class CalculatorMain {
    public static void main(String[] args) {

        Calculator basicCalculator = new BasicCalculator();
        Calculator advancedCalculator = new AdvancedCalculator();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Write number, then type of operation (+, -, *, /), then number again or 'exit' to quit");
            String input = scanner.next();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            double a = Double.parseDouble(input);
            char operation = scanner.next().charAt(0);
            double b = scanner.nextDouble();

            if (basicCalculator.operations.containsKey(operation)) {
                System.out.println(basicCalculator.operations.get(operation).calculate(a, b));
            } else if (advancedCalculator.operations.containsKey(operation)) {
                System.out.println(advancedCalculator.operations.get(operation).calculate(a, b));
            } else {
                System.out.println("Operation not supported");
            }
        }
    }
}