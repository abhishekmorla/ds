package com.morle;

import java.util.Arrays;
import java.util.Scanner;

public class reversearr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int arr[],int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
//        while (start < end)
//        {
//            swap(arr,start,end);
//            start++;
//            end--;
//        }
        for (start = 0;start < end ; start++,end--)
        {
            swap(arr,start,end);
        }
    }
}
