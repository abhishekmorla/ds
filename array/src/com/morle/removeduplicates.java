package com.morle;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class removeduplicates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = {4, 3, 2, 7, 8, 3, 2, 1};
        System.out.println(findDisappearedNumbersreal(arr));

    }
    private static List<Integer> findDisappearedNumbersreal(int[] nums) {
        int idx;
        for (int i = 0; i < nums.length; i++) {
            idx = Math.abs(nums[i]) - 1;
            if (nums[idx] > 0)
            {
                nums[idx] = nums[idx] * -1;
            }
        }
        List<Integer> list = new ArrayList<Integer>(); // to save
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0)
            {
                list.add(i+1);
            }
        }
        return list;

    }
    private static void findDisappearedNumbersUsingHashSet(int[] inputArray)
    {
        // O(N) with space complexity
        HashSet<Integer> h = new HashSet<Integer>();
        for (int i = 0; i < inputArray.length; i++) {
            h.add(inputArray[i]); // remove duplicates , sorted
        }
        System.out.println(h);
        List<Integer> list = new ArrayList<>(100); // to save
        for (int i = 1; i <= inputArray.length; i++) {
            if (!h.contains(i)){
                list.add(i);
            }
        }
        System.out.println(list);
    }


    public static List<Integer> findDisappearedNumbers(int[] arr) {
        // O(N^2)
        List<Integer> list = new ArrayList<>(100);
        for (int i = 1; i <= arr.length; i++) {
            int found = 0; // base condition in loop
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == i) {
                    found = 1; // base condition.
                    break;
                }
            }
            if (found == 0 ){
                list.add(i);
            }
        }
        return list;
    }
}

