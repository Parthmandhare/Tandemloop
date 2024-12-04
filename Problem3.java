import java.util.Scanner;

class Probelm3 {
    // Method to generate modified odd number series
    public static void generateSeries(int a) {
        // Validate input
        if (a <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate the number of odd numbers to print
        int oddNumberCount = (a + 1) / 2;

        // Generate and print the series
        for (int i = 1; i <= oddNumberCount; i++) {
            // Calculate the ith odd number using the formula 2i - 1
            int currentNumber = 2 * i - 1;

            // Print the number with comma and space, except for the last number
            if (i < oddNumberCount) {
                System.out.print(currentNumber + ", ");
            } else {
                System.out.println(currentNumber);
            }
        }
    }

    // Main method to handle user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                // Prompt for input
                System.out.print("Enter a positive integer (or 0 to exit): ");
                int input = scanner.nextInt();

                // Check for exit condition
                if (input == 0) {
                    break;
                }

                // Generate and print the series
                generateSeries(input);

                // Ask if user wants to continue
                System.out.print("Do you want to generate another series? (yes/no): ");
                scanner.nextLine(); // Consume newline
                String continueChoice = scanner.nextLine().toLowerCase();

                if (!continueChoice.equals("yes")) {
                    break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Clear invalid input
            }
        }

        scanner.close();
        System.out.println("Program closed.");
    }
}