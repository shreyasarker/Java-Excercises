package DataTypes;

public class DefaultValues {
    // Class-level variables
    static byte b;
    static short s;
    static int i;
    static long l;
    static float f;
    static double d;
    static char c;
    static boolean bool;

    public static void main(String[] args) {
        // Print default values
        System.out.println("Default Byte: " + b);
        System.out.println("Default Short: " + s);
        System.out.println("Default Integer: " + i);
        System.out.println("Default Long: " + l);
        System.out.println("Default Float: " + f);
        System.out.println("Default Double: " + d);
        System.out.println("Default Char: " + c); // Will print a blank
        System.out.println("Default Boolean: " + bool);
    }
}
