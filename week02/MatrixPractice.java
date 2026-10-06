public class MatrixPractice {
    public static void main(String[] args) {
        int[][] first = {
            {1, 2, 3},
            {4, 5, 6}
        };
        int[][] second = {
            {9, 8, 7},
            {6, 5, 4}
        };

        // matrix addition
        int[][] sum = new int[2][3];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                sum[row][col] = first[row][col] + second[row][col];
            }
        }

        System.out.println("First matrix:");
        printMatrix(first);
        System.out.println("Second matrix:");
        printMatrix(second);
        System.out.println("Sum of matrices:");
        printMatrix(sum);

        // transpose: rows become columns (2x3 becomes 3x2)
        int[][] transpose = new int[3][2];
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                transpose[col][row] = first[row][col];
            }
        }
        System.out.println("Transpose of first matrix:");
        printMatrix(transpose);
    }

    // helper method to print any 2D array
    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.print(matrix[row][col] + "\t");
            }
            System.out.println();
        }
    }
}
