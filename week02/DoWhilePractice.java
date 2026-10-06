import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        // do-while runs the body at least one time
        int countdown = 5;
        do {
            System.out.println("Countdown: " + countdown);
            countdown--;
        } while (countdown > 0);
        System.out.println("Liftoff!");

        // keep adding numbers until the user enters 0
        Scanner input = new Scanner(System.in);
        int value;
        int sum = 0;
        do {
            System.out.print("Enter a number to add (0 to stop): ");
            value = input.nextInt();
            sum += value;
        } while (value != 0);

        System.out.println("Total sum = " + sum);
        input.close();
    }
}
