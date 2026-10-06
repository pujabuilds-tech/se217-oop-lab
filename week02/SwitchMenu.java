import java.util.Scanner;

public class SwitchMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Tea  2. Coffee  3. Juice");
        System.out.print("Choose your drink (1-3): ");
        int c = sc.nextInt();

        switch (c) {
            case 1: System.out.println("You chose Tea"); break;
            case 2: System.out.println("You chose Coffee"); break;
            case 3: System.out.println("You chose Juice"); break;
            default: System.out.println("Invalid choice");
        }
        sc.close();
    }
}
