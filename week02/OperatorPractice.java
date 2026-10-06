public class OperatorPractice {
    public static void main(String[] args) {
        int a = 13, b = 4;
        System.out.println(a + b + " " + (a - b) + " " + a * b + " " + a / b + " " + a % b);

        System.out.println(a > b);
        System.out.println(a == b);
        System.out.println(a != b);

        System.out.println((a > 10) && (b > 10));
        System.out.println((a > 10) || (b > 10));
        System.out.println(!(a > 10));

        int x = 5;
        x++;
        System.out.println("x after x++: " + x);
        x--;
        System.out.println("x after x--: " + x);

        x += 10;
        System.out.println("x += 10: " + x);
        x *= 2;
        System.out.println("x *= 2: " + x);
    }
}
