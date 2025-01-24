package ConditionalStatements;

import java.util.Scanner;

public class TriangleTypeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three sides of the triangle
        System.out.print("Enter the first side of the triangle: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter the second side of the triangle: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter the third side of the triangle: ");
        double side3 = scanner.nextDouble();

        // Check if the sides form a valid triangle
        if (side1 + side2 > side3 && side2 + side3 > side1 && side1 + side3 > side2) {
            if (side1 == side2 && side2 == side3) {
                System.out.println("The triangle is equilateral.");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isosceles.");
            } else {
                System.out.println("The triangle is scalene.");
            }
        } else {
            System.out.println("The sides do not form a valid triangle.");
        }

        scanner.close();
    }
}
