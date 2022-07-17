package com.morle;

import java.util.Arrays;

public class flippinganimage {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.deepToString(flipAndInvertImageng((arr))));

    }
    public static int[][] flipAndInvertImageng(int[][] image) {
        //reverse array
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length)/2; j++) {
                int temp = image[i][j];
                image[i][j] = image[i][image.length - 1 - j];
                image[i][image.length - 1 - j] = temp;
            }
        }
        // reverting if 0 then 1
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < (image[0].length); j++) {
                if (image[i][j] == 0)
                {
                    image[i][j] = 1;
                }
                else{
                    image[i][j] = 0;
                }
            }
            }
        return image;
        }



    //for swapping 1d array and invert
    public static int[] rev1d(int[] image) {
        int n = image.length;
        for (int i = 0; i < n/2; i++) {
            int temp = image[i];
            image[i] = image[n-1-i];
            image[n-1-i] = temp;
        }
        for (int i = 0; i < n; i++) {
            if (image[i] == 0)
            {
                image[i] = 1;
            }
            else{
                image[i] = 0;
            }
        }
        return image;
    }
}
