import java.util.Scanner;

public class IfElseCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1: positive, negative or zero
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        if (number > 0) {
            System.out.println(number + " is positive");
        } else if (number < 0) {
            System.out.println(number + " is negative");
        } else {
            System.out.println("The number is zero");
        }

        // Example 2: even or odd
        if (number % 2 == 0) {                  // even numbers leave remainder 0
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }

        // Example 3: age check
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("You are an adult");
        } else {
            System.out.println("You are a minor");
        }

        // Example 4: larger of two numbers
        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();
        if (first > second) {
            System.out.println(first + " is larger");
        } else if (second > first) {
            System.out.println(second + " is larger");
        } else {
            System.out.println("Both numbers are equal");
        }

        // Example 5: range check using && (reuses the first number)
        if (number >= 1 && number <= 100) {
            System.out.println(number + " is between 1 and 100");
        } else {
            System.out.println(number + " is outside 1 to 100");
        }

        input.close();
    }
}
