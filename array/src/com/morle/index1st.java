package com.morle;

import java.util.*;

public class index1st {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[1000];
        int[] arr1 = new int[1000];
        int[] ans = new int[1000];

//        int[] ans = new int[nums.length]; new way to dynamically instialise the array.
//        class Solution {
//            public int[] buildArray(int[] nums) {
//                int[] ans = new int[nums.length];
//                for (int j = 0; j < nums.length ; j++) {
//                    ans[j] = nums[nums[j]];
//                }
//                return ans;
//            }
//        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        for (int j = 0; j < arr.length ; j++) {
           ans[j] = arr[arr[j]];
        }
        for (int j = 0; j < arr.length ; j++) {
            System.out.println(ans[j]);
        }
    }
}
