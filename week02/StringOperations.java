public class StringOperations {
    public static void main(String[] args) {
        String s = "Hello Java World";
        System.out.println("Length: " + s.length());
        System.out.println("substring(6, 10): " + s.substring(6, 10));
        System.out.println("indexOf(\"World\"): " + s.indexOf("World"));
        System.out.println("replace: " + s.replace("World", "Lab"));
        System.out.println("equals: " + s.equals("hello java world"));
        System.out.println("trim: [" + "   hi   ".trim() + "]");

        String w = "radar", r = "";
        for (int i = w.length() - 1; i >= 0; i--) r += w.charAt(i);
        if (w.equals(r)) System.out.println(w + " is a palindrome");
        else System.out.println(w + " is not a palindrome");
    }
}
