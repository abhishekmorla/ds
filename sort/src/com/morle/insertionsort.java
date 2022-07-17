package com.morle;

import java.util.Arrays;

public class insertionsort {
    public static void main(String[] args) {
        int[] arr = {160,1,237,45,76,104};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = i+1; j > 0 ; j--) {
                    if (arr[j-1] > arr[j]){
                        swap(arr , j-1,j );
                    }

            }

        }
    }
    static void swap(int[] arr,int first , int second )
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
