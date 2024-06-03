public class MatrixMultiplication {
    public static void main(String[] args) {
        int[][] firstMatrix = { {1, 2, 3}, {4, 5, 6}, {7, 5, 5}};
        int[][] secondMatrix = { {7, 8}, {9, 10}, {11, 12} };

        int rowsFirst = firstMatrix.length;
        int colsFirst = firstMatrix[0].length;
        int colsSecond = secondMatrix[0].length;

        int[][] result = new int[rowsFirst][colsSecond];

        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsSecond; j++) {
                for (int k = 0; k < colsFirst; k++) {
                    result[i][j] += firstMatrix[i][k] * secondMatrix[k][j];
                }
            }
        }

        // Print the result matrix
        for (int i = 0; i < rowsFirst; i++) {
            for (int j = 0; j < colsSecond; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}
