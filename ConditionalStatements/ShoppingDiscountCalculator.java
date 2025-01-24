package ConditionalStatements;

import java.util.Scanner;

public class ShoppingDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take purchase details
        System.out.print("Enter total purchase amount: ₹");
        double amount = scanner.nextDouble();
        System.out.print("Are you a premium member? (yes/no): ");
        String isMember = scanner.next().toLowerCase();

        double discount;

        // Apply discount based on membership and amount
        if (isMember.equals("yes")) {
            if (amount > 10000) {
                discount = 0.20 * amount; // 20% discount for premium members with high purchases
            } else {
                discount = 0.10 * amount; // 10% discount for premium members
            }
        } else {
            if (amount > 10000) {
                discount = 0.10 * amount; // 10% discount for regular customers with high purchases
            } else if (amount > 5000) {
                discount = 0.05 * amount; // 5% discount for regular customers
            } else {
                discount = 0; // No discount for smaller purchases
            }
        }

        // Calculate the final amount
        double finalAmount = amount - discount;

        // Display the result
        System.out.println("Your discount is: ₹" + discount);
        System.out.println("Your final bill amount is: ₹" + finalAmount);

        scanner.close();
    }
}
