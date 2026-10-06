public class ForLoopPractice {
    public static void main(String[] args) {
        // Example 1: counting up
        System.out.println("--- Example 1: counting 1 to 10 ---");
        for (int i = 1; i <= 10; i++) {          // start; condition; step
            System.out.print(i + " ");
        }
        System.out.println();

        // Example 2: counting down
        System.out.println("--- Example 2: countdown ---");
        for (int i = 5; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println("Go!");

        // Example 3: sum of 1 to n
        System.out.println("--- Example 3: sum ---");
        int n = 100;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;                            // keep adding to the running total
        }
        System.out.println("Sum of 1 to " + n + " = " + sum);

        // Example 4: multiplication table
        System.out.println("--- Example 4: table of 7 ---");
        int tableOf = 7;
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }

        // Example 5: step by 2 (even numbers)
        System.out.println("--- Example 5: even numbers up to 20 ---");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
