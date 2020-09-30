package matrix_calc;

public class MatrixCalculator {

    public int[][] multiplyMatrix(int[][] m1, int[][] m2) {
        //the first multiplicand must have the same no. of columns as the no. of rows in the second multiplicand
        if (!validate(m1, m2))
            throw new IllegalArgumentException("Matrices incompatible for multiplication");

        // the resultant matrix will have the same no. of rows as the first multiplicand and same np. of columns as the second multiplicand
        int[][] m3 = new int[m1.length][m2[0].length];

        // now from the perspective of the target array: we know we'll have m1.length no. of rows and m2[0].length of cols
        // and for every cell, we need a value, with calculation of that value now moved to a separate helper method
        for (int row = 0; row < m3.length; row++) {
            for (int col = 0; col < m3[row].length; col++) {
                m3[row][col] = getTargetCellValue(m1, m2, row, col);
            }
        }
        return m3;
    }

    // a method with four parameters is bad, but...
    private int getTargetCellValue(int[][] m1, int[][] m2, int row, int col) {
        int m3CellVal = 0;
        for (int k = 0; k < m2.length; k++) {
            m3CellVal += m1[row][k] * m2[k][col];
        }
        return m3CellVal;
    }

    private boolean validate(int[][] m1, int[][] m2) {
        //check no. of columns on first matrix == no. of. rows on the second matrix
        //check columns on both matrices are all same length
        return  m1[0].length == m2.length && isSameLenCols(m1) && isSameLenCols(m2);
    }

    private boolean isSameLenCols(int[][] m) {
        int lenFirstRow = m[0].length;
        for (int i = 1; i < m.length; i++) {
            if (lenFirstRow != m[i].length) {
                return false;
            }
        }
        return true;
    }
}

