import java.util.Scanner;

class Problem1 {
    // Method to perform calculation based on operation type
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "addition":
                return addition(a, b);
            case "subtraction":
                return subtraction(a, b);
            case "multiplication":
                return multiplication(a, b);
            case "division":
                return division(a, b);
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }
    }

    // Addition method
    private double addition(double a, double b) {
        return a + b;
    }

    // Subtraction method
    private double subtraction(double a, double b) {
        return a - b;
    }

    // Multiplication method
    private double multiplication(double a, double b) {
        return a * b;
    }

    // Division method with error handling
    private double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Main method to handle user input and calculations
    public static void main(String[] args) {
        Problem1 calc = new Problem1();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prompt for first number
                System.out.print("Enter the first number: ");
                double a = scanner.nextDouble();

                // Prompt for second number
                System.out.print("Enter the second number: ");
                double b = scanner.nextDouble();

                // Consume the newline left-over
                scanner.nextLine();

                // Prompt for operation
                System.out.println("Choose operation (addition/subtraction/multiplication/division):");
                String operation = scanner.nextLine();

                // Perform calculation
                double result = calc.calculate(a, b, operation);
                System.out.println("Result: " + result);

                // Ask if user wants to continue
                System.out.print("Do you want to perform another calculation? (yes/no): ");
                String continueCalc = scanner.nextLine().toLowerCase();

                if (!continueCalc.equals("yes")) {
                    break;
                }

            } catch (IllegalArgumentException e) {
                System.out.println("Error: " + e.getMessage());
                System.out.println("Please choose a valid operation.");
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
        System.out.println("Calculator closed.");
    }
}