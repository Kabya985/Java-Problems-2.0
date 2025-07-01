public class IdentityMatrixChecker {

    // Method to check identity matrix
    public static boolean isIdentityMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        // Must be a square matrix
        if (rows != cols) {
            return false;
        }

        // Check all elements
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (i == j && matrix[i][j] != 1) {
                    return false; // Diagonal element not 1
                } else if (i != j && matrix[i][j] != 0) {
                    return false; // Non-diagonal element not 0
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Example 1: Identity matrix
        int[][] matrix1 = {
            {1, 0, 0},
            {0, 1, 0},
            {0, 0, 1}
        };

        // Example 2: Not an identity matrix
        int[][] matrix2 = {
            {1, 0, 0},
            {0, 2, 0},
            {0, 0, 1}
        };

        System.out.println("Matrix 1 is identity matrix? " + isIdentityMatrix(matrix1)); // true
        System.out.println("Matrix 2 is identity matrix? " + isIdentityMatrix(matrix2)); // false
    }
}