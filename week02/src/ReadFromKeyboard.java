import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Scanner reads from the keyboard

        // Example 1: read a String (a whole line)
        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();
        System.out.println("Hello, " + fullName + "!");

        // Example 2: read an int
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Next year you will be " + (age + 1));

        // Example 3: read a double
        System.out.print("Enter your CGPA: ");
        double cgpa = input.nextDouble();
        System.out.println("Your CGPA is " + cgpa);

        // Example 4: use the values together
        System.out.printf("%s is %d years old with CGPA %.2f%n", fullName, age, cgpa);

        // Example 5: nextLine() after a number first needs to eat the leftover Enter key
        input.nextLine();                       // clears the leftover new line
        System.out.print("Enter your favourite subject: ");
        String subject = input.nextLine();
        System.out.println("Favourite subject: " + subject);

        input.close();
    }
}
