package practic;
import java.util.Scanner;
class Calculator {
    public double addition(double a, double b) {
        return a + b;
    }

    public double subtraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
    }
}

 class calculatoterApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (+, -, *, /): ");
        String operation = scanner.next();

        double result = 0;

        if (operation.equals("+")) {
            result = calculator.addition(a, b);
        } else if (operation.equals("-")) {
            result = calculator.subtraction(a, b);
        } else if (operation.equals("*")) {
            result = calculator.multiplication(a, b);
        } else if (operation.equals("/")) {
            result = calculator.division(a, b);
        } else {
            System.out.println("Invalid operation.");
        }

        System.out.println("Result: " + result);
    }
}
