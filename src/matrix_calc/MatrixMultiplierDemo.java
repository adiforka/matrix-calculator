package matrix_calc;

import java.util.Arrays;

public class MatrixMultiplierDemo {
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1, 2, 3, 4},
                {4, 5, 6, 5},
                {6, 7, 8, 6}

        };


        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6},
                {6, 7, 8},
                {4, 3, 2}
        };

        MatrixCalculator matrixCalculator = new MatrixCalculator();
        int[][] m3 = matrixCalculator.multiplyMatrix(matrix1, matrix2);
        System.out.println(Arrays.deepToString(m3));
    }
}
