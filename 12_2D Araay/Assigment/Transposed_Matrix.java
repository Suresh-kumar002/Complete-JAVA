package Assigment;

public class Transposed_Matrix {

    // Fixed: Added parameter name 'matrix' to method signature
    public static void printMatrix(int[][] matrix) {
        System.out.println("The Matrix is : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " "); // Fixed: use print instead of println
            }
            System.out.println(); 
        }
    }

    public static void main(String[] args) {
        int row = 2, col = 3;
        int matrix[][] = {
            {2, 3, 7},
            {5, 6, 7}
        };

        // Display original matrix
        System.out.println("Original Matrix:");
        printMatrix(matrix);

        // Transpose matrix
        int transpose[][] = new int[col][row];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Display transposed matrix
        System.out.println("Transposed Matrix:");
        printMatrix(transpose);
    }
}
