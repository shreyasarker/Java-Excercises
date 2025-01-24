package ConditionalStatements;

import java.util.Scanner;

public class MenuSelection {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display a menu
        System.out.println("Select an option:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Enter your choice (1-4): ");

        // Read user input for menu selection
        int choice = scanner.nextInt();

        // Prompt user for two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Perform the operation based on user choice using a switch statement
        double result;
        switch (choice) {
            case 1:
                result = num1 + num2;
                System.out.println("The result is: " + result);
                break;
            case 2:
                result = num1 - num2;
                System.out.println("The result is: " + result);
                break;
            case 3:
                result = num1 * num2;
                System.out.println("The result is: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The result is: " + result);
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}
