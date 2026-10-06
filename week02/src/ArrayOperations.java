public class ArrayOperations {

    // Helper to print an array like [1, 2, 3]
    static String show(int[] data) {
        String text = "[";
        for (int i = 0; i < data.length; i++) {
            text += data[i];
            if (i < data.length - 1) {
                text += ", ";
            }
        }
        return text + "]";
    }

    public static void main(String[] args) {
        int[] marks = {72, 85, 60, 94, 78, 85};
        System.out.println("Array: " + show(marks));

        // Example 1: maximum and minimum
        System.out.println("--- Example 1: max and min ---");
        int max = marks[0];                      // start with the first element
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("Max = " + max + ", Min = " + min);

        // Example 2: sum and average
        System.out.println("--- Example 2: sum and average ---");
        int sum = 0;
        for (int m : marks) {                    // for-each loop
            sum += m;
        }
        double average = (double) sum / marks.length;
        System.out.println("Sum = " + sum);
        System.out.printf("Average = %.2f%n", average);

        // Example 3: reverse (on a copy, so the original stays unchanged)
        System.out.println("--- Example 3: reverse ---");
        int[] copy = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            copy[i] = marks[i];
        }
        for (int i = 0; i < copy.length / 2; i++) {
            int temp = copy[i];                  // swap first and last, then move inward
            copy[i] = copy[copy.length - 1 - i];
            copy[copy.length - 1 - i] = temp;
        }
        System.out.println("Reversed: " + show(copy));

        // Example 4: linear search
        System.out.println("--- Example 4: search ---");
        int target = 94;
        int foundAt = -1;                        // -1 means not found
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == target) {
                foundAt = i;
                break;
            }
        }
        if (foundAt != -1) {
            System.out.println(target + " found at index " + foundAt);
        } else {
            System.out.println(target + " not found");
        }

        // Example 5: count how many times a value appears
        System.out.println("--- Example 5: count occurrences ---");
        int wanted = 85;
        int times = 0;
        for (int m : marks) {
            if (m == wanted) {
                times++;
            }
        }
        System.out.println(wanted + " appears " + times + " times");
    }
}
