package com.morle;

import java.util.Arrays;

public class mergesort {
    public static void main(String[] args) {
        int[] arr = {5,4,2,3,20,45};
        System.out.println(Arrays.toString(mergersorting(arr)));
    }

     static int[] mergersorting(int[] arr){
        if (arr.length == 1)
        {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergersorting(Arrays.copyOfRange(arr , 0 , mid));
        int[] right = mergersorting(Arrays.copyOfRange(arr , mid , arr.length));
        return merge(left,right);
    }

    static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length + second.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < first.length && j < second.length)
        {
            if (first[i] < second[j])
            {
                mix[k] = first[i];
                i++;
            }
            else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }
        // it may be possible if one of array is not completed
        while(i < first.length)
        {
            mix[k] = first[i];
            i++;
            k++;
        }
        while(j < second.length)
        {
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;

        //time complexity
        // merging at every level of dividing therefore n
        // time complexity for tree is o(logn)
        // .: O(n*logn)
    }
}
