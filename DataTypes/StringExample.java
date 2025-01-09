package DataTypes;

public class StringExample {
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // Concatenate strings
        String fullName = firstName + " " + lastName;
        System.out.println("Full Name: " + fullName);

        // String length
        System.out.println("Length of Full Name: " + fullName.length());

        // String to uppercase
        System.out.println("Uppercase Full Name: " + fullName.toUpperCase());
    }
}
