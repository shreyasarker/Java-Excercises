package ConditionalStatements;

import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input coefficients of the quadratic equation: ax^2 + bx + c = 0
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant: D = b^2 - 4ac
        double discriminant = b * b - 4 * a * c;

        if (a == 0) {
            System.out.println("This is not a quadratic equation.");
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are real and distinct: " + root1 + " and " + root2);
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            System.out.println("The roots are real and equal: " + root);
        } else {
            System.out.println("The roots are complex and imaginary.");
        }

        scanner.close();
    }
}
