public class ForLoopPractice {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int sum = 0;
        for (int i = 1; i <= 100; i++) sum += i;
        System.out.println("Sum 1 to 100 = " + sum);

        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + " = " + 8 * i);
        }
    }
}
