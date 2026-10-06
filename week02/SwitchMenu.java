import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===== Simple Calculator =====");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.print("Choose an option (1-4): ");
        int choice = input.nextInt();

        System.out.print("Enter the first number: ");
        double first = input.nextDouble();
        System.out.print("Enter the second number: ");
        double second = input.nextDouble();

        switch (choice) {
            case 1:
                System.out.println("Result: " + (first + second));
                break;
            case 2:
                System.out.println("Result: " + (first - second));
                break;
            case 3:
                System.out.println("Result: " + (first * second));
                break;
            case 4:
                if (second == 0) {
                    System.out.println("Cannot divide by zero.");
                } else {
                    System.out.println("Result: " + (first / second));
                }
                break;
            default:
                System.out.println("Invalid option. Please choose 1 to 4.");
        }

        input.close();
    }
}
