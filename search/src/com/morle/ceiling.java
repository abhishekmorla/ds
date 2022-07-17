package com.morle;

import java.util.Scanner;

public class ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 100;
        int ans =  ceils(arr, target );
        System.out.println(ans);
    }

        static int ceils(int[] arr, int tar) {
            int start = 0;
            int end = arr.length-1;
            if (arr[end]  < tar) {
                return -1;
            }
            while (start <= end)
            {
                int mid = start + (end-start)/2;
                if(tar > arr[mid])
                    start = mid+1;
                else if (tar < arr[mid])
                    end = mid - 1;
                else
                    return arr[mid];
            }
            return arr[start];
    }
}
