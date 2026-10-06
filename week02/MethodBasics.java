public class MethodBasics {

    // returns the square of a number
    public static int square(int n) {
        return n * n;
    }

    // returns the bigger of two numbers
    public static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // returns true if the number is prime
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // factorial using recursion (method calls itself)
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // a method with no return value
    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        greet("Student");
        System.out.println("Square of 9 = " + square(9));
        System.out.println("Max of 14 and 31 = " + max(14, 31));

        int check = 17;
        if (isPrime(check)) {
            System.out.println(check + " is prime.");
        } else {
            System.out.println(check + " is not prime.");
        }

        System.out.println("Factorial of 6 = " + factorial(6));
    }
}
