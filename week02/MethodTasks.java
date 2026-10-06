public class MethodTasks {
    static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    static boolean isPalindrome(int n) {
        int copy = n, rev = 0;
        while (copy > 0) {
            rev = rev * 10 + copy % 10;
            copy /= 10;
        }
        return rev == n;
    }

    static double toFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static int fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    static int[] minMax(int[] a) {
        int min = a[0], max = a[0];
        for (int x : a) {
            if (x < min) min = x;
            if (x > max) max = x;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println("gcd(36, 24) = " + gcd(36, 24));
        System.out.println("isPalindrome(1221) = " + isPalindrome(1221));
        System.out.println("30 C = " + toFahrenheit(30) + " F");

        System.out.print("Fibonacci: ");
        for (int i = 0; i < 8; i++) System.out.print(fibonacci(i) + " ");
        System.out.println();

        int[] r = minMax(new int[]{9, 3, 17, 5});
        System.out.println("Min = " + r[0] + ", Max = " + r[1]);
    }
}
