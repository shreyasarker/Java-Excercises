package DataTypes;

public class TypeCasting {
    public static void main(String[] args) {
        // Implicit casting (smaller to larger type)
        int intVal = 100;
        double doubleVal = intVal; // int to double
        System.out.println("Implicit Casting (int to double): " + doubleVal);

        // Explicit casting (larger to smaller type)
        double doubleValue = 9.78;
        int intValue = (int) doubleValue; // double to int
        System.out.println("Explicit Casting (double to int): " + intValue);

        // Potential data loss
        long longVal = 10000000000L;
        int smallInt = (int) longVal; // Data loss
        System.out.println("Data loss in casting long to int: " + smallInt);
    }
}
