package com.morle;

import java.util.Arrays;

//https://leetcode.com/problems/find-smallest-letter-greater-than-target/
public class chara {
    public static void main(String[] args) {
        char[] arr = {'c','d','e','j','p'};
        char target = 'c';
        char ans =  nextGreatestLetter2(arr, target );
        System.out.println(ans);
    }
    static  public char nextGreatestLetter(char[] arr, char tar) {
        int start = 0;
        int end = arr.length;
        while (start < end)
        {
            int mid = start + (end-start)/2;
            if(tar >= arr[mid])
                start = mid+1;
            else
                end = mid;
        }
        return arr[start % arr.length];
    }
    static  public char nextGreatestLetter2(char[] arr, char tar) {
        for (int i = 0; i < arr.length; i++) {
            if (tar < arr[i])
                return arr[i];
        }
        return arr[0];
    }
}
