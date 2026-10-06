public class ForLoopPractice {
    public static void main(String[] args) {
        // 1. counting from 1 to 10
        System.out.println("Counting 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // counting backwards
        System.out.println("Counting 10 to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. sum of numbers from 1 to 50
        int total = 0;
        for (int i = 1; i <= 50; i++) {
            total += i;
        }
        System.out.println("Sum of 1 to 50 = " + total);

        // 3. multiplication table of 6
        int tableOf = 6;
        System.out.println("Multiplication table of " + tableOf + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tableOf + " x " + i + " = " + (tableOf * i));
        }
    }
}
