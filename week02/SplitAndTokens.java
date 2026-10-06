public class SplitAndTokens {
    public static void main(String[] args) {
        String[] fruits = "apple,mango,banana".split(",");
        for (String f : fruits) System.out.println(f);

        String[] nums = "10 20 30".split(" ");
        int sum = 0;
        for (String n : nums) sum += Integer.parseInt(n);
        System.out.println("Sum: " + sum);

        String[] parts = "a1b22c333d".split("[0-9]+");
        for (String p : parts) System.out.print(p + " ");
        System.out.println();
    }
}
