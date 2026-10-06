public class OperatorPractice {
    public static void main(String[] args) {
        // Example 1: arithmetic operators
        System.out.println("--- Example 1: arithmetic ---");
        int a = 17;
        int b = 5;
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));       // integer division gives 3
        System.out.println("a % b = " + (a % b));       // remainder gives 2
        System.out.println("a / 5.0 = " + (a / 5.0));   // one decimal makes it 3.4

        // Example 2: relational operators (result is true or false)
        System.out.println("--- Example 2: relational ---");
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));
        System.out.println("a > b  : " + (a > b));
        System.out.println("a <= b : " + (a <= b));

        // Example 3: logical operators
        System.out.println("--- Example 3: logical ---");
        int age = 20;
        boolean hasCard = false;
        System.out.println("age >= 18 && hasCard : " + (age >= 18 && hasCard)); // both must be true
        System.out.println("age >= 18 || hasCard : " + (age >= 18 || hasCard)); // one is enough
        System.out.println("!hasCard             : " + !hasCard);               // reverses the value

        // Example 4: increment and decrement
        System.out.println("--- Example 4: ++ and -- ---");
        int x = 5;
        int y = x++;   // post: y gets 5 first, then x becomes 6
        System.out.println("x = " + x + ", y = " + y);
        int z = ++x;   // pre: x becomes 7 first, then z gets 7
        System.out.println("x = " + x + ", z = " + z);
        x--;
        System.out.println("after x-- : " + x);

        // Example 5: compound assignment
        System.out.println("--- Example 5: compound assignment ---");
        int score = 10;
        score += 5;    // score = score + 5
        System.out.println("+= 5  -> " + score);
        score -= 3;
        System.out.println("-= 3  -> " + score);
        score *= 2;
        System.out.println("*= 2  -> " + score);
        score /= 4;
        System.out.println("/= 4  -> " + score);
        score %= 4;
        System.out.println("%= 4  -> " + score);
    }
}
