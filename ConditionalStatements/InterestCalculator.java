package ConditionalStatements;

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user inputs
        System.out.print("Enter the principal amount (₹): ");
        double principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period (in years): ");
        int time = scanner.nextInt();
        System.out.print("Do you want to calculate Simple Interest or Compound Interest? (Enter 'SI' or 'CI'): ");
        String choice = scanner.next().toUpperCase();

        double interest = 0;

        // Calculate interest based on user's choice
        if (choice.equals("SI")) {
            // Simple Interest formula: SI = (Principal * Rate * Time) / 100
            interest = (principal * rate * time) / 100;
            System.out.println("Simple Interest: ₹" + interest);
        } else if (choice.equals("CI")) {
            // Compound Interest formula: CI = Principal * (1 + Rate/100)^Time - Principal
            interest = principal * Math.pow((1 + rate / 100), time) - principal;
            System.out.println("Compound Interest: ₹" + interest);
        } else {
            System.out.println("Invalid choice! Please enter 'SI' or 'CI'.");
        }

        // Calculate the total amount
        double totalAmount = principal + interest;
        System.out.println("Total amount to be paid: ₹" + totalAmount);

        scanner.close();
    }
}
