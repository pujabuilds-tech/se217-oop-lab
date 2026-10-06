public class OperatorPractice {
    public static void main(String[] args) {
        int a = 17;
        int b = 5;

        // arithmetic operators
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // relational operators (result is true or false)
        System.out.println("a > b  : " + (a > b));
        System.out.println("a < b  : " + (a < b));
        System.out.println("a >= 17: " + (a >= 17));
        System.out.println("a <= b : " + (a <= b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        // logical operators
        boolean sunny = true;
        boolean weekend = false;
        System.out.println("sunny && weekend : " + (sunny && weekend));
        System.out.println("sunny || weekend : " + (sunny || weekend));
        System.out.println("!sunny           : " + (!sunny));

        // increment and decrement
        int count = 10;
        System.out.println("count = " + count);
        System.out.println("count++ gives " + (count++) + ", now count = " + count);
        System.out.println("++count gives " + (++count) + ", now count = " + count);
        System.out.println("count-- gives " + (count--) + ", now count = " + count);
        System.out.println("--count gives " + (--count) + ", now count = " + count);

        // compound assignment
        int score = 50;
        score += 10;
        System.out.println("score += 10 -> " + score);
        score -= 5;
        System.out.println("score -= 5  -> " + score);
        score *= 2;
        System.out.println("score *= 2  -> " + score);
        score /= 11;
        System.out.println("score /= 11 -> " + score);
        score %= 7;
        System.out.println("score %= 7  -> " + score);
    }
}
