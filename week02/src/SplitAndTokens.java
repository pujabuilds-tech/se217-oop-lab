public class SplitAndTokens {
    public static void main(String[] args) {
        // Example 1: split a String by a comma
        System.out.println("--- Example 1: split by comma ---");
        String fruits = "mango,banana,guava,lychee";
        String[] parts = fruits.split(",");
        for (int i = 0; i < parts.length; i++) {
            System.out.println(i + " -> " + parts[i]);
        }

        // Example 2: split numbers, convert with parseInt, then add
        System.out.println("--- Example 2: parseInt and sum ---");
        String numbers = "10 20 30 40";
        String[] pieces = numbers.split(" ");
        int sum = 0;
        for (int i = 0; i < pieces.length; i++) {
            sum += Integer.parseInt(pieces[i]);   // text "10" becomes the int 10
        }
        System.out.println("Sum = " + sum);

        // Example 3: regex \\s+ means one or more spaces
        System.out.println("--- Example 3: regex split on spaces ---");
        String messy = "  Java   is    fun  ";
        String[] words = messy.trim().split("\\s+");   // trim first to avoid an empty first token
        System.out.println("Word count: " + words.length);
        for (String w : words) {
            System.out.println("[" + w + "]");
        }

        // Example 4: regex with several separators
        System.out.println("--- Example 4: split on , ; or : ---");
        String mixed = "red,green;blue:yellow";
        String[] colours = mixed.split("[,;:]");       // [ ] means any one of these characters
        for (String c : colours) {
            System.out.println(c);
        }

        // Example 5: split a date and handle a bad number safely
        System.out.println("--- Example 5: date and error handling ---");
        String date = "2026-10-06";
        String[] d = date.split("-");
        int year = Integer.parseInt(d[0]);
        int month = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);
        System.out.println("Day " + day + ", Month " + month + ", Year " + year);
        try {
            int bad = Integer.parseInt("12abc");       // not a valid number
            System.out.println(bad);
        } catch (NumberFormatException e) {
            System.out.println("12abc is not a valid integer");
        }
    }
}
