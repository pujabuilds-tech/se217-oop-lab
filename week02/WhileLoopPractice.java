public class WhileLoopPractice {
    public static void main(String[] args) {
        int n = 7094, sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("Digit sum: " + sum);

        int num = 2580, rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        System.out.println("Reversed: " + rev);
    }
}
