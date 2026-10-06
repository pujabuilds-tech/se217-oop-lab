import java.util.Scanner;

public class ReadFromKeyboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your city: ");
        String city = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        System.out.print("Enter your weight in kg: ");
        double weight = sc.nextDouble();

        System.out.println(city + " | " + age + " years | " + weight + " kg");
        sc.close();
    }
}
