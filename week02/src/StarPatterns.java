public class StarPatterns {
    public static void main(String[] args) {
        int rows = 5;

        // Example 1: right triangle (outer loop = rows, inner loop = stars)
        System.out.println("--- Example 1: triangle ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();                // new line after each row
        }

        // Example 2: inverted triangle
        System.out.println("--- Example 2: inverted triangle ---");
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Example 3: pyramid (spaces first, then stars)
        System.out.println("--- Example 3: pyramid ---");
        for (int i = 1; i <= rows; i++) {
            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");           // leading spaces
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");           // odd count of stars
            }
            System.out.println();
        }

        // Example 4: number pattern
        System.out.println("--- Example 4: number pattern ---");
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
