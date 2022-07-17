package com.morle;

import java.util.Arrays;

public class searchin2d {
    public static void main(String[] args) {
        int[][] nums = {
                {12 , 34 ,6},
                {4 ,62 , 3},
                {44 ,612 , 1337}
        };
        int target = 612;
        int ans[] = serch(nums , target);
        System.out.println(Arrays.toString(ans));
        System.out.println(serch2(nums));
    }

    static int[] serch(int[][] nums , int tar)
    {
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (tar == nums[i][j])
                {
                    return new int[]{i , j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    static int serch2(int[][] nums)
    {
        int max = nums[0][0];
        for (int[] num : nums) {
            for (int i : num) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }
}
