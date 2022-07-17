package com.morle;

public class matrixdiagonalsum {
    public static void main(String[] args) {
        int[][] arr =   {{7,3,1,9},
                        {3,4,6,9},
                        {6,9,6,6},
                        {9,5,8,5}};
        System.out.println(diagonalSum(arr));
    }
    public static int diagonalSum(int[][] mat) {
        int sum = 0;
        int sum1 = 0;
        int total = 0;
        for (int i = 0; i < mat.length; i++) {
            sum = sum + mat[i][i];
        }
        int i = 0;
        for (int j = mat.length-1; j >= 0; --j, i += 1) {
            //j = 3 , i = 1
            //j = 2 , i = 2
            //j = 1 , i = 3
            sum1 += mat[j][i];
        }
        if (mat.length%2 == 0)
        {
            return sum+sum1;
        }
        //if its odd then minus the middle element from the sum.
        return sum+sum1 - mat[(mat.length-1)/2][(mat.length-1)/2];
    }
}
