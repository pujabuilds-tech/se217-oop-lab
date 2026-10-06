public class MatrixPractice {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] b = {{7, 8, 9}, {1, 2, 3}};

        System.out.println("Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) System.out.print((a[i][j] + b[i][j]) + " ");
            System.out.println();
        }

        System.out.println("Transpose of A:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 2; i++) System.out.print(a[i][j] + " ");
            System.out.println();
        }
    }
}
