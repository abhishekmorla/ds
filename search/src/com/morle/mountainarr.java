package com.morle;

import java.util.Arrays;
import java.util.Scanner;

public class mountainarr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 50, 10, 9, 7, 6};
        int peak =  binarysearchs(arr);

    }
    static int binarysearchs(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid + 1] )
            // you are in dec part of array
                // this may be the ans , but look at left
            //this is why end!= mid - 1
                end = mid;
            else{
                // you are in as part of array

                start = mid + 1 ; // because we know that mid + 1 > mid
            }
        }
        // in the end start == end and pointing to largest number
        //at every point of time , we are finding the best possible largest number till that time.

        return arr[end];
    }
}

