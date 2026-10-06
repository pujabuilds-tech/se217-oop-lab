import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String fullName = input.nextLine();

        System.out.print("Enter your age (whole number): ");
        int age = input.nextInt();

        System.out.print("Enter your CGPA (decimal number): ");
        double cgpa = input.nextDouble();

        System.out.println();
        System.out.println("----- Your Details -----");
        System.out.println("Name: " + fullName);
        System.out.println("Age: " + age);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Age after 5 years: " + (age + 5));

        input.close();
    }
}
