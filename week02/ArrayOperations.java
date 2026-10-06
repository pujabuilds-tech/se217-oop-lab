public class ArrayOperations {
    public static void main(String[] args) {
        int[] a = {15, 62, 8, 47, 33};
        int max = a[0], min = a[0], sum = 0;

        for (int x : a) {
            if (x > max) max = x;
            if (x < min) min = x;
            sum += x;
        }
        System.out.println("Max: " + max + ", Min: " + min);
        System.out.println("Sum: " + sum + ", Average: " + (double) sum / a.length);

        System.out.print("Reversed: ");
        for (int i = a.length - 1; i >= 0; i--) System.out.print(a[i] + " ");
        System.out.println();

        int key = 47, pos = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) pos = i;
        }
        System.out.println(key + " found at index " + pos);
    }
}
