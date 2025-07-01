public class MatrixRotation {
    // Rotate the matrix in-place by 90 degrees clockwise
    public static void rotate90Clockwise(int[][] matrix) {
        int n = matrix.length;

        // Step 1: Transpose the matrix (row becomes column)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Swap matrix[i][j] with matrix[j][i]
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        // Step 2: Reverse each row
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                // Swap left and right elements in the row
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n - 1 - j];
                matrix[i][n - 1 - j] = temp;
            }
        }
    }

    // Utility method to print a matrix
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Example square matrix
        int[][] matrix = {
            { 1,  2,  3 },
            { 4,  5,  6 },
            { 7,  8,  9 }
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        rotate90Clockwise(matrix);

        System.out.println("\nMatrix after 90° Clockwise Rotation:");
        printMatrix(matrix);
    }
}