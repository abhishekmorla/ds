package com.morle;

import java.util.Arrays;

public class selectionsort {
    public static void main(String[] args) {
        int[] arr = {10,2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            //find the max then swap with correct pos
            int last = arr.length - i - 1;
            int maxindex = getMaxindex(arr , last);
            swap(arr,maxindex,last);
        }
    }

    static void swap(int[] arr,int first , int second )
    {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    public static int getMaxindex(int[] arr, int last) {
        int max = 0;
        for (int j = 1; j <= last; j++) {
            if ( arr[max] < arr[j] )
            {
                max = j; // if you want element arr[j] if you want index then j
            }
        }
        return max;
    }
}
