package DataTypes;

public class DataTypeCompatibility {
    public static void main(String[] args) {
        int num = 10;
        double decimal = 5.5;

        // Incompatible types example
        // int result = num + decimal; // Error: incompatible types

        // Corrected with explicit casting
        int result = num + (int) decimal;
        System.out.println("Result after casting: " + result);

        // Compatible types
        double sum = num + decimal;
        System.out.println("Sum (compatible types): " + sum);
    }
}
