package ConditionalStatements;

import java.util.Scanner;

public class AgeGroupCategorization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user to input their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Nested if-else to categorize the age group
        if (age >= 0 && age <= 12) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age <= 17) {
            System.out.println("You are a teenager.");
        } else if (age >= 18 && age <= 64) {
            System.out.println("You are an adult.");
        } else if (age >= 65) {
            System.out.println("You are a senior.");
        } else {
            System.out.println("Invalid age.");
        }

        scanner.close();
    }
}
