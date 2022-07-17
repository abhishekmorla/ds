package com.morle;

import java.util.Scanner;

public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {2,5,16,32,64};
        int target = 16;
        int index =  binarysearchs(arr, target );
        System.out.println(index);
    }
    static int binarysearchs(int[] arr , int tar)
    {
        int start = 0;
        int end = arr.length-1;
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if(tar > arr[mid])
              start = mid+1;
            else if (tar < arr[mid])
                end = mid - 1;
            else{
                return mid;
            }
        }
        return -1;
    }
}
