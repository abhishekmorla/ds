package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class runningsum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);        ArrayList<Integer> list2 = new ArrayList<>(10);
        ArrayList<Integer> list3 = new ArrayList<>(10);
        int[] nums = new int[4];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 4 ; i++) {
            nums[i] = in.nextInt();
        }
        int n = nums.length;
        //for converting int num to arraylist (list)
        for (int j = 0; j < n; j++) {
            list.add(nums[j]);
        }
        int sum =0;
        for (int i = 0; i < n; i++) {
            sum = sum + list.get(i);
            list3.add(sum);
        }
        int[] arr = list3.stream().mapToInt(i -> i).toArray();

    }
}
