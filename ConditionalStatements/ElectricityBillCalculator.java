package ConditionalStatements;

import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of units consumed
        System.out.print("Enter the number of units consumed: ");
        int units = scanner.nextInt();

        double billAmount;

        // Calculate bill amount using conditional statements
        if (units <= 100) {
            billAmount = units * 5; // ₹5 per unit for first 100 units
        } else if (units <= 300) {
            billAmount = (100 * 5) + ((units - 100) * 7); // ₹7 per unit for next 200 units
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((units - 300) * 10); // ₹10 per unit for above 300 units
        }

        // Add a fixed service charge of ₹50
        billAmount += 50;

        // Print the total bill
        System.out.println("Your total electricity bill is: ₹" + billAmount);

        scanner.close();
    }
}
