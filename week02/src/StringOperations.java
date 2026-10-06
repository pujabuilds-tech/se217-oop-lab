public class StringOperations {

    // Palindrome check: compare characters from both ends
    static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Example 1: length, charAt, substring
        System.out.println("--- Example 1: length, charAt, substring ---");
        String word = "Programming";
        System.out.println("Length: " + word.length());
        System.out.println("First character: " + word.charAt(0));
        System.out.println("Last character: " + word.charAt(word.length() - 1));
        System.out.println("substring(0, 7): " + word.substring(0, 7));  // end index is not included
        System.out.println("substring(7): " + word.substring(7));        // from index 7 to the end

        // Example 2: indexOf, lastIndexOf, contains
        System.out.println("--- Example 2: searching ---");
        System.out.println("indexOf('g'): " + word.indexOf('g'));
        System.out.println("lastIndexOf('g'): " + word.lastIndexOf('g'));
        System.out.println("indexOf(\"xyz\"): " + word.indexOf("xyz"));   // -1 means not found
        System.out.println("contains(\"gram\"): " + word.contains("gram"));

        // Example 3: replace, upper/lower case, trim
        System.out.println("--- Example 3: replace and trim ---");
        String sentence = "   I like Java   ";
        System.out.println("Before trim: [" + sentence + "]");
        String clean = sentence.trim();                                  // removes outer spaces
        System.out.println("After trim : [" + clean + "]");
        System.out.println("replace: " + clean.replace("Java", "OOP"));
        System.out.println("upper: " + clean.toUpperCase());
        System.out.println("lower: " + clean.toLowerCase());

        // Example 4: equals vs ==
        System.out.println("--- Example 4: equals ---");
        String s1 = "java";
        String s2 = new String("java");
        System.out.println("s1 == s2      : " + (s1 == s2));             // compares memory location
        System.out.println("s1.equals(s2) : " + s1.equals(s2));          // compares the text
        System.out.println("equalsIgnoreCase: " + "JAVA".equalsIgnoreCase(s1));

        // Example 5: palindrome
        System.out.println("--- Example 5: palindrome ---");
        String[] tests = {"madam", "level", "hello", "racecar"};
        for (int i = 0; i < tests.length; i++) {
            if (isPalindrome(tests[i])) {
                System.out.println(tests[i] + " is a palindrome");
            } else {
                System.out.println(tests[i] + " is not a palindrome");
            }
        }
    }
}
