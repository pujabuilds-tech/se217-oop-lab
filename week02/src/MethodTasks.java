public class MethodTasks {

    // GCD using Euclid's method
    static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // Palindrome number: reverse the digits and compare
    static boolean isPalindromeNumber(int n) {
        int original = n;
        int reversed = 0;
        while (n > 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return original == reversed;
    }

    static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

    // nth Fibonacci number (0, 1, 1, 2, 3, 5, ...) using a loop
    static long fibonacci(int n) {
        long previous = 0;
        long current = 1;
        if (n == 0) {
            return 0;
        }
        for (int i = 2; i <= n; i++) {
            long next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }

    // A method can return two values by packing them in an array
    static int[] minMax(int[] data) {
        int min = data[0];
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) {
                min = data[i];
            }
            if (data[i] > max) {
                max = data[i];
            }
        }
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        // Example 1: gcd
        System.out.println("--- Example 1: gcd ---");
        System.out.println("gcd(48, 18) = " + gcd(48, 18));
        System.out.println("gcd(17, 5) = " + gcd(17, 5));

        // Example 2: palindrome numbers
        System.out.println("--- Example 2: palindrome number ---");
        int[] candidates = {121, 1331, 123, 4004};
        for (int i = 0; i < candidates.length; i++) {
            System.out.println(candidates[i] + " -> " + isPalindromeNumber(candidates[i]));
        }

        // Example 3: temperature conversion
        System.out.println("--- Example 3: temperature ---");
        System.out.printf("37.0 C = %.1f F%n", celsiusToFahrenheit(37.0));
        System.out.printf("98.6 F = %.1f C%n", fahrenheitToCelsius(98.6));

        // Example 4: fibonacci series
        System.out.println("--- Example 4: first 10 fibonacci numbers ---");
        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();

        // Example 5: min and max returned as an array
        System.out.println("--- Example 5: min and max ---");
        int[] values = {34, 7, 91, 15, 62};
        int[] result = minMax(values);
        System.out.println("Min = " + result[0] + ", Max = " + result[1]);
    }
}
