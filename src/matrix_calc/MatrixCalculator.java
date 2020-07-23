package matrix_calc;

public class MatrixCalculator {

    public int[][] multiplyMatrix(int[][] m1, int[][] m2) {
        //the first multiplicand must have the same no. of columns as the no. of rows in the second multiplicand
        if (!validateForMultiplication(m1, m2))
            throw new IllegalArgumentException("Matrices incompatible for multiplication");

        //the resultant matrix will have the same no. of rows as the first multiplicand and same np. of columns as the second multiplicand
        int[][] m3 = new int[m1.length][m2[0].length];

        //1 * 1, 2 * 4, 3 * 6, 4 * 4 the sum of these gives (0:0)
        //1 * 2, 2 * 5, 3 * 7, 4 * 3 the sum of these gives (0:1)
        //1 * 3, 2 * 6, 3 * 8, 4 * 2 the sum of these gives (0:2)
        //etc.

        //this resets the m1 row to multiply all the values in a given column in m2 until it has done so for all m2's columns,
        //and only then it increments
        for (int i = 0; i < m1.length; i++) {
            for (int j = 0; j < m1.length; j++) {
                int m3CellVal = 0;
                for (int k = 0; k < m2.length; k++) {
                    m3CellVal += m1[i][k] * m2[k][j];
                }
                m3[i][j] = m3CellVal;
            }
        }
        return m3;
    }

    private boolean validateForMultiplication(int[][] m1, int[][] m2) {
        //check no. of columns on first matrix == no. of. rows on the second matrix
        if (m1[0].length != m2.length) return false;

        int lenFirstRowM1 = m1[0].length;
        for (int[] ints : m1) {
            if (lenFirstRowM1 != ints.length) {
                return false;
            }
        }

        int lenFirstRowM2 = m2[0].length;
        for (int[] ints : m2) {
            if (lenFirstRowM2 != ints.length) {
                return false;
            }
        }
        return true;
    }
}

