public class ArrayOperations {
    public static void main(String[] args) {
        int[] marks = {64, 91, 38, 77, 52, 85, 29};

        // maximum, minimum and sum
        int highest = marks[0];
        int lowest = marks[0];
        int total = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > highest) {
                highest = marks[i];
            }
            if (marks[i] < lowest) {
                lowest = marks[i];
            }
            total = total + marks[i];
        }
        double average = (double) total / marks.length;

        System.out.println("Number of items: " + marks.length);
        System.out.println("Highest: " + highest);
        System.out.println("Lowest: " + lowest);
        System.out.println("Sum: " + total);
        System.out.println("Average: " + average);

        // reverse print
        System.out.print("Reversed: ");
        for (int i = marks.length - 1; i >= 0; i--) {
            System.out.print(marks[i] + " ");
        }
        System.out.println();

        // linear search
        int searchFor = 85;
        int foundAt = -1;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] == searchFor) {
                foundAt = i;
                break;
            }
        }
        if (foundAt == -1) {
            System.out.println(searchFor + " was not found.");
        } else {
            System.out.println(searchFor + " found at index " + foundAt);
        }
    }
}
