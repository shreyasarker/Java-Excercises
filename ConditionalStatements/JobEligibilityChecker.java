package ConditionalStatements;

import java.util.Scanner;

public class JobEligibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take inputs for candidate's details
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a degree? (yes/no): ");
        String hasDegree = scanner.next().toLowerCase();
        System.out.print("Enter your years of experience: ");
        int experience = scanner.nextInt();

        // Check eligibility conditions
        if (age >= 21 && age <= 35) {
            if (hasDegree.equals("yes")) {
                if (experience >= 2) {
                    System.out.println("You are eligible to apply for the job.");
                } else {
                    System.out.println("You need at least 2 years of experience to apply.");
                }
            } else {
                System.out.println("A degree is required to apply for the job.");
            }
        } else {
            System.out.println("You do not meet the age criteria for the job.");
        }

        scanner.close();
    }
}
