public class VariablesAndTypes {
    public static void main(String[] args) {
        // Example 1: declaring and using variables
        System.out.println("--- Example 1: variables ---");
        int books = 12;
        double price = 349.75;
        char sectionLetter = 'F';
        boolean isOpen = true;
        String shop = "Campus Book Corner";
        System.out.println(shop + " has " + books + " books, open: " + isOpen);
        System.out.println("Price: " + price + ", section letter: " + sectionLetter);

        // Example 2: implicit casting (small type -> big type, done automatically)
        System.out.println("--- Example 2: implicit casting ---");
        int smallNumber = 42;
        long bigNumber = smallNumber;        // int fits inside long
        double decimalNumber = smallNumber;  // int becomes 42.0
        System.out.println(bigNumber + " and " + decimalNumber);

        // Example 3: explicit casting (big type -> small type, we must write it)
        System.out.println("--- Example 3: explicit casting ---");
        double pi = 3.14159;
        int cutPi = (int) pi;                // decimal part is cut off, not rounded
        System.out.println("pi as int: " + cutPi);
        int total = 17;
        int count = 5;
        System.out.println("Without cast: " + (total / count));          // integer division = 3
        System.out.println("With cast: " + ((double) total / count));    // 3.4

        // Example 4: char and int are connected through ASCII codes
        System.out.println("--- Example 4: char and int ---");
        char letter = 'A';
        int code = letter;                   // char to int is automatic
        char twoLater = (char) (letter + 2); // int to char needs a cast
        System.out.println(letter + " has code " + code + ", two letters later: " + twoLater);

        // Example 5: final constants cannot change after the first assignment
        System.out.println("--- Example 5: final constants ---");
        final double TAX_RATE = 0.15;
        final int MAX_SEATS = 40;
        double bill = 1000;
        double tax = bill * TAX_RATE;
        System.out.println("Tax on " + bill + " is " + tax + ", seats allowed: " + MAX_SEATS);
        // TAX_RATE = 0.20;  // remove the // to see a compile error
    }
}
