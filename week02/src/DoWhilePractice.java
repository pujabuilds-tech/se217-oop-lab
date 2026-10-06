import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Example 1: counting with do-while
        System.out.println("--- Example 1: count 1 to 5 ---");
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 5);                        // condition is checked AFTER the body
        System.out.println();

        // Example 2: the body runs once even when the condition is false
        System.out.println("--- Example 2: runs at least once ---");
        int k = 10;
        do {
            System.out.println("k is " + k + " but I still ran once");
            k++;
        } while (k < 5);

        // Example 3: countdown
        System.out.println("--- Example 3: countdown ---");
        int count = 3;
        do {
            System.out.println(count);
            count--;
        } while (count > 0);
        System.out.println("Liftoff!");

        // Example 4: keep asking until the input is valid
        System.out.println("--- Example 4: positive number check ---");
        int positive;
        do {
            System.out.print("Enter a positive number: ");
            positive = input.nextInt();
            if (positive <= 0) {
                System.out.println("That was not positive, try again");
            }
        } while (positive <= 0);
        System.out.println("Thank you, you entered " + positive);

        // Example 5: add numbers until the user enters 0
        System.out.println("--- Example 5: running total ---");
        int value;
        int total = 0;
        do {
            System.out.print("Enter a number to add (0 to stop): ");
            value = input.nextInt();
            total += value;
        } while (value != 0);
        System.out.println("Total = " + total);

        input.close();
    }
}
