package com.morle;

import java.util.Arrays;

public class oddinmatrix {
    public static void main(String[] args) {
        int[][] ind = {{0,1},{1,1}};
        int m = 2;
        int n = 3;
        System.out.println((oddCells(2, 3, ind)));
    }

    public static int oddCells(int m, int n, int[][] indices) {
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = 0;
            }
        }
        for (int i = 0; i < indices.length; i++) {
            int r = indices[i][0];
            int c = indices[i][1];
            for (int j = 0; j < n; j++) {
                arr[r][j]++;
            }
            for (int j = 0; j < m; j++) {
                arr[j][c]++;
            }
        }
        int cp =0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] % 2 != 0)
                {
                  cp++;
                }

            }
        }
        return cp;
    }

}
