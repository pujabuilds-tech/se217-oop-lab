import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1: calculator menu
        System.out.println("1. Add  2. Subtract  3. Multiply  4. Divide");
        System.out.print("Choose an option (1-4): ");
        int choice = input.nextInt();
        System.out.print("Enter the first number: ");
        double a = input.nextDouble();
        System.out.print("Enter the second number: ");
        double b = input.nextDouble();
        switch (choice) {
            case 1:
                System.out.println("Sum = " + (a + b));
                break;                          // break stops the switch
            case 2:
                System.out.println("Difference = " + (a - b));
                break;
            case 3:
                System.out.println("Product = " + (a * b));
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Cannot divide by zero");
                } else {
                    System.out.println("Quotient = " + (a / b));
                }
                break;
            default:                            // runs when no case matches
                System.out.println("Invalid option");
        }

        // Example 2: day name from a number
        System.out.print("Enter a day number (1-7, 1 = Saturday): ");
        int day = input.nextInt();
        switch (day) {
            case 1: System.out.println("Saturday"); break;
            case 2: System.out.println("Sunday"); break;
            case 3: System.out.println("Monday"); break;
            case 4: System.out.println("Tuesday"); break;
            case 5: System.out.println("Wednesday"); break;
            case 6: System.out.println("Thursday"); break;
            case 7: System.out.println("Friday"); break;
            default: System.out.println("Day number must be 1 to 7");
        }

        // Example 3: vowel check, several cases share one result (fall-through)
        System.out.print("Enter a single letter: ");
        char letter = input.next().toLowerCase().charAt(0);
        switch (letter) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(letter + " is a vowel");
                break;
            default:
                System.out.println(letter + " is not a vowel");
        }

        // Example 4: switch on a String (no keyboard input)
        String size = "medium";
        switch (size) {
            case "small":
                System.out.println("Price: 50");
                break;
            case "medium":
                System.out.println("Price: 80");
                break;
            case "large":
                System.out.println("Price: 120");
                break;
            default:
                System.out.println("Unknown size");
        }

        input.close();
    }
}
