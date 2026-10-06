public class WhileLoopPractice {
    public static void main(String[] args) {
        // 1. sum of digits of a number
        int number = 5821;
        int temp = number;
        int digitSum = 0;
        while (temp > 0) {
            int lastDigit = temp % 10;  // take the last digit
            digitSum += lastDigit;      // add it
            temp = temp / 10;           // remove the last digit
        }
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + digitSum);

        // 2. reverse a number
        int original = 40739;
        int copy = original;
        int reversed = 0;
        while (copy > 0) {
            int lastDigit = copy % 10;
            reversed = reversed * 10 + lastDigit;
            copy = copy / 10;
        }
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);

        // 3. print even numbers up to 20
        int n = 2;
        System.out.print("Even numbers up to 20: ");
        while (n <= 20) {
            System.out.print(n + " ");
            n += 2;
        }
        System.out.println();
    }
}
