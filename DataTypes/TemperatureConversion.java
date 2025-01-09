package DataTypes;

import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert to Fahrenheit
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        // Convert back to Celsius
        double convertedCelsius = (fahrenheit - 32) * 5 / 9;
        System.out.println("Converted back to Celsius: " + convertedCelsius);

        scanner.close();
    }

}
