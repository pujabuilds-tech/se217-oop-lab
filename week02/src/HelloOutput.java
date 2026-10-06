public class HelloOutput {
    public static void main(String[] args) {
        // Example 1: print() keeps the cursor on the same line
        System.out.println("--- Example 1: print ---");
        System.out.print("Learning ");
        System.out.print("Java ");
        System.out.print("step by step");
        System.out.println(); // empty println just moves to a new line

        // Example 2: println() moves to the next line after printing
        System.out.println("--- Example 2: println ---");
        System.out.println("Welcome to the OOP Lab");
        System.out.println(10 + 5);                   // numbers are added: 15
        System.out.println("10 + 5 = " + 10 + 5);     // text comes first, so 5 is joined as text: 105
        System.out.println("10 + 5 = " + (10 + 5));   // brackets fix it: 15

        // Example 3: printf() formats the output using placeholders
        System.out.println("--- Example 3: printf ---");
        String course = "SE 217";
        int credits = 1;
        double fee = 2500.5;
        System.out.printf("Course: %s, Credits: %d, Fee: %.2f%n", course, credits, fee); // %n = new line

        // Example 4: escape characters
        System.out.println("--- Example 4: escape characters ---");
        System.out.println("Column1\tColumn2\tColumn3");        // \t = tab
        System.out.println("Line one\nLine two");               // \n = new line
        System.out.println("She said \"Practice daily\"");      // \" = double quote
        System.out.println("Folder: C:\\lab\\week02");          // \\ = one backslash

        // Example 5: width and alignment with printf
        System.out.println("--- Example 5: alignment ---");
        System.out.printf("|%-10s|%10s|%n", "left", "right");   // - means left aligned
        System.out.printf("|%05d|%8.3f|%n", 42, 3.14159);       // 0 pads with zeros
    }
}
