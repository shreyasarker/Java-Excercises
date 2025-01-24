package ConditionalStatements;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input weight and height
        System.out.print("Enter your weight (in kg): ");
        double weight = scanner.nextDouble();
        System.out.print("Enter your height (in meters): ");
        double height = scanner.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Determine BMI category
        System.out.printf("Your BMI is: %.2f%n", bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else {
            System.out.println("You are obese.");
        }

        scanner.close();
    }
}
