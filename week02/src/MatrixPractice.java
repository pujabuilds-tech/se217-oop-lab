public class MatrixPractice {

    // Helper to print a 2D array row by row
    static void printMatrix(int[][] m) {
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] first = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] second = {
            {7, 8, 9},
            {1, 2, 3}
        };

        // Example 1: print a matrix
        System.out.println("--- Example 1: first matrix (2 x 3) ---");
        printMatrix(first);

        // Example 2: matrix addition (same size, add matching cells)
        System.out.println("--- Example 2: addition ---");
        int[][] sum = new int[2][3];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                sum[i][j] = first[i][j] + second[i][j];
            }
        }
        printMatrix(sum);

        // Example 3: transpose (rows become columns)
        System.out.println("--- Example 3: transpose (3 x 2) ---");
        int[][] transpose = new int[3][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = first[i][j];   // swap the indexes
            }
        }
        printMatrix(transpose);

        // Example 4: row sums and column sums
        System.out.println("--- Example 4: row and column sums ---");
        for (int i = 0; i < first.length; i++) {
            int rowSum = 0;
            for (int j = 0; j < first[i].length; j++) {
                rowSum += first[i][j];
            }
            System.out.println("Row " + i + " sum = " + rowSum);
        }
        for (int j = 0; j < first[0].length; j++) {
            int colSum = 0;
            for (int i = 0; i < first.length; i++) {
                colSum += first[i][j];
            }
            System.out.println("Column " + j + " sum = " + colSum);
        }
    }
}
