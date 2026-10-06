public class MethodBasics {
    static int square(int n) {
        return n * n;
    }

    static int max(int a, int b) {
        if (a > b) return a;
        return b;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println("square(6) = " + square(6));
        System.out.println("max(12, 5) = " + max(12, 5));
        System.out.println("isPrime(13) = " + isPrime(13));
        System.out.println("factorial(5) = " + factorial(5));
    }
}
