package easyProblems.transposeMatrix;

import java.util.Arrays;

public class Solution {

    //868. Transpose Matrix

    //Given a matrix A, return the transpose of A.
    //
    //The transpose of a matrix is the matrix flipped over it's main diagonal, switching the row and column indices of the matrix.

    public static void main(String[] args) {
        int[][] nums = new int[][]{{5}, {8}};
        System.out.println(Arrays.toString(transpose(nums)));
    }

    private static int[][] transpose(int[][] A) {
        int row = A.length, col = A[0].length;      //Use names: row and col to avoid confusion...
        int[][] result = new int[col][row];
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                result[i][j] = A[j][i];                //Flip rows with columns in resultant matrix.
            }
        }
        return result;
    }
}
