public class SplitAndTokens {
    public static void main(String[] args) {
        // 1. split by comma
        String fruits = "apple,banana,mango,orange";
        String[] fruitList = fruits.split(",");
        System.out.println("Fruits found: " + fruitList.length);
        for (int i = 0; i < fruitList.length; i++) {
            System.out.println(i + " -> " + fruitList[i]);
        }

        // 2. split numbers and use parseInt to convert text to int
        String numberText = "12 30 8 45";
        String[] parts = numberText.split(" ");
        int sum = 0;
        for (int i = 0; i < parts.length; i++) {
            int value = Integer.parseInt(parts[i]);
            sum += value;
        }
        System.out.println("Sum of numbers = " + sum);

        // 3. regex split: split by one or more spaces
        String messy = "Java   is    fun";
        String[] words = messy.split("\\s+");
        System.out.println("Words after \\s+ split: " + words.length);
        for (String w : words) {
            System.out.println(w);
        }

        // 4. regex split: split by comma, semicolon or colon
        String mixed = "red,green;blue:yellow";
        String[] colors = mixed.split("[,;:]");
        System.out.println("Colors:");
        for (String c : colors) {
            System.out.println(c);
        }
    }
}
