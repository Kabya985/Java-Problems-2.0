public class ZigzagTraversal {
    public static void printZigzag(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        System.out.println("Zigzag Traversal:");
        for (int i = 0; i < rows; i++) {
            if (i % 2 == 0) {
                // Even row index: left to right
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } else {
                // Odd row index: right to left
                for (int j = cols - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
            { 1,  2,  3,  4 },
            { 5,  6,  7,  8 },
            { 9, 10, 11, 12 },
            {13, 14, 15, 16}
        };

        printZigzag(matrix);
    }
}