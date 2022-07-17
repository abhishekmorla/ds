package com.morle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class concatnation {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(4);
        ArrayList<Integer> list2 = new ArrayList<>(10);
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
        for (int i = 0; i < n; i++) {
            list2.add(list.get(i));
        }
        int[] arr = list2.stream().mapToInt(i -> i).toArray(); // for converting arratlist to int array

    }




    }

