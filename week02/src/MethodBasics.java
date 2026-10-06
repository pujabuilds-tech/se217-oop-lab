public class MethodBasics {

    // A void method returns nothing
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Methods that return a value
    static int square(int n) {
        return n * n;
    }

    static int max(int a, int b) {
        if (a > b) {
            return a;
        }
        return b;
    }

    // Prime check: try dividing by every number up to the square root
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Recursion: a method that calls itself, with a base case to stop
    static long factorial(int n) {
        if (n <= 1) {
            return 1;                  // base case
        }
        return n * factorial(n - 1);   // smaller problem
    }

    static int sumTo(int n) {
        if (n == 0) {
            return 0;                  // base case
        }
        return n + sumTo(n - 1);
    }

    public static void main(String[] args) {
        // Example 1: void method
        System.out.println("--- Example 1: void method ---");
        greet("Lab Student");

        // Example 2: square and max
        System.out.println("--- Example 2: square and max ---");
        System.out.println("square(9) = " + square(9));
        System.out.println("max(14, 27) = " + max(14, 27));

        // Example 3: prime numbers
        System.out.println("--- Example 3: primes up to 30 ---");
        for (int i = 1; i <= 30; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Example 4: factorial with recursion
        System.out.println("--- Example 4: factorial ---");
        System.out.println("5! = " + factorial(5));
        System.out.println("10! = " + factorial(10));

        // Example 5: another recursion
        System.out.println("--- Example 5: recursive sum ---");
        System.out.println("sumTo(10) = " + sumTo(10));
    }
}
