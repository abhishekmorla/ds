package com.morle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class rcw {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        int rows = arr.length;
        int cols = arr[0].length; // it will give the number of columns.

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            int sumcol = 0;
            for (int j = 0; j < cols ; j++) {
                sumcol = sumcol + arr[i][j];
            }
            list.add(sumcol);
        }
        // maxium of list
        Integer k = Collections.max(list);
        System.out.println(k);
    }
}
