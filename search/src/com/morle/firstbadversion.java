package com.morle;

import java.util.Arrays;
import java.util.Scanner;

public class firstbadversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // 5
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt(); // 5 7 7 7 8
        }
        System.out.println(Arrays.toString(arr));
        int bad = 7;
        int index = sear(arr , bad);
        System.out.println(index);
    }

    static int sear(int[] arr, int tar) {
        int start = binarysearchs(arr,tar,true);
        return start;
    }

    static int binarysearchs(int[] arr , int tar,boolean firstsindi) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (tar > arr[mid])
                start = mid + 1;
            else if (tar < arr[mid])
                end = mid - 1;
            else {
                ans = mid; // potential ans (let us assume)
                if (firstsindi)
                {
                    end = mid - 1; //for finding first occurance
                }
                else{
                    start = mid + 1; // for finding last
                }
            }
        }
        return ans;
    }
}