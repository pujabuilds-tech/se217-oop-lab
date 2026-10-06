public class MethodTasks {

    // greatest common divisor
    public static int gcd(int a, int b) {
        while (b != 0) {
            int remainder = a % b;
            a = b;
            b = remainder;
        }
        return a;
    }

    // check if a number reads the same forward and backward
    public static boolean isPalindromeNumber(int number) {
        int copy = number;
        int reversed = 0;
        while (copy > 0) {
            reversed = reversed * 10 + copy % 10;
            copy = copy / 10;
        }
        return reversed == number;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // print the first n Fibonacci numbers
    public static void printFibonacci(int n) {
        int previous = 0;
        int current = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(previous + " ");
            int next = previous + current;
            previous = current;
            current = next;
        }
        System.out.println();
    }

    // returns both min and max inside one array: [0] = min, [1] = max
    public static int[] findMinMax(int[] data) {
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
        int[] result = {min, max};
        return result;
    }

    public static void main(String[] args) {
        System.out.println("GCD of 48 and 18 = " + gcd(48, 18));

        int[] testNumbers = {12321, 4567};
        for (int i = 0; i < testNumbers.length; i++) {
            if (isPalindromeNumber(testNumbers[i])) {
                System.out.println(testNumbers[i] + " is a palindrome number.");
            } else {
                System.out.println(testNumbers[i] + " is not a palindrome number.");
            }
        }

        System.out.println("37 C = " + celsiusToFahrenheit(37) + " F");
        System.out.println("100 F = " + fahrenheitToCelsius(100) + " C");

        System.out.print("First 10 Fibonacci numbers: ");
        printFibonacci(10);

        int[] values = {18, 4, 92, 33, 7, 61};
        int[] answer = findMinMax(values);
        System.out.println("Min = " + answer[0] + ", Max = " + answer[1]);
    }
}
