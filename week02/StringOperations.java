public class StringOperations {
    public static void main(String[] args) {
        String text = "Object Oriented Programming";

        // length and substring
        System.out.println("Text: " + text);
        System.out.println("Length: " + text.length());
        System.out.println("First character: " + text.charAt(0));
        System.out.println("substring(7): " + text.substring(7));
        System.out.println("substring(0, 6): " + text.substring(0, 6));

        // indexOf
        System.out.println("Index of 'O': " + text.indexOf('O'));
        System.out.println("Index of 'Oriented': " + text.indexOf("Oriented"));
        System.out.println("Index of 'z': " + text.indexOf('z'));

        // replace and case
        System.out.println("Replace 'o' with '0': " + text.replace('o', '0'));
        System.out.println("Upper case: " + text.toUpperCase());
        System.out.println("Lower case: " + text.toLowerCase());

        // equals
        String word1 = "java";
        String word2 = "JAVA";
        System.out.println("equals: " + word1.equals(word2));
        System.out.println("equalsIgnoreCase: " + word1.equalsIgnoreCase(word2));

        // trim removes spaces from both ends
        String spaced = "    hello lab    ";
        System.out.println("Before trim: [" + spaced + "]");
        System.out.println("After trim : [" + spaced.trim() + "]");

        // palindrome check
        String candidate = "madam";
        String backwards = "";
        for (int i = candidate.length() - 1; i >= 0; i--) {
            backwards = backwards + candidate.charAt(i);
        }
        if (candidate.equals(backwards)) {
            System.out.println(candidate + " is a palindrome.");
        } else {
            System.out.println(candidate + " is not a palindrome.");
        }
    }
}
