import java.util.Scanner;

public class DoWhilePractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Enter a number greater than 0: ");
            n = sc.nextInt();
        } while (n <= 0);
        System.out.println("You entered " + n);
        sc.close();
    }
}
