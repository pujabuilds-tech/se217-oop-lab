public class WhileLoopPractice {
    public static void main(String[] args) {
        // Example 1: sum of digits
        System.out.println("--- Example 1: digit sum ---");
        int number = 4821;
        int temp = number;                       // keep the original safe
        int digitSum = 0;
        while (temp > 0) {
            digitSum += temp % 10;               // last digit
            temp = temp / 10;                    // remove the last digit
        }
        System.out.println("Digit sum of " + number + " = " + digitSum);

        // Example 2: reverse a number
        System.out.println("--- Example 2: reverse ---");
        int original = 12345;
        int reversed = 0;
        temp = original;
        while (temp > 0) {
            reversed = reversed * 10 + temp % 10; // push the last digit to the back
            temp /= 10;
        }
        System.out.println(original + " reversed is " + reversed);

        // Example 3: count digits
        System.out.println("--- Example 3: count digits ---");
        int big = 9087654;
        int digits = 0;
        temp = big;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }
        System.out.println(big + " has " + digits + " digits");

        // Example 4: powers of 2 below 200
        System.out.println("--- Example 4: powers of 2 ---");
        int power = 1;
        while (power < 200) {
            System.out.print(power + " ");
            power *= 2;
        }
        System.out.println();

        // Example 5: repeat until a condition is met
        System.out.println("--- Example 5: savings ---");
        int saved = 0;
        int weeks = 0;
        while (saved < 1000) {
            saved += 150;                        // save 150 each week
            weeks++;
        }
        System.out.println("Needed " + weeks + " weeks to save " + saved);
    }
}
