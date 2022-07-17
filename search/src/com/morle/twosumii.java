package com.morle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class twosumii {
    public static void main(String[] args) {
//        System.out.println(lawda());
        int[] arr = {3,24,50,79,88,150,345};
        int target = 200;
        System.out.println(Arrays.toString(good(arr, target)));
    }
    public static int[] good(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(arr[start]+arr[end] != target)
        {
            int total = arr[start]+arr[end];
            if(total > target)
            {
                end--;
            }
            else if(total < target)
            {
                start++;
            }
        }
        return new int[] {start+1,end+1};
    }

//    public static ArrayList<Integer> lawda() {
//        ArrayList<Integer> list = new ArrayList<>(5);
//        ArrayList<Integer> list2 = new ArrayList<>(5);
//        Scanner in = new Scanner(System.in);
//        for (int i = 0; i < 3; i++) {
//            list.add(in.nextInt());
//        }
//        int target = 100;
//        int ans = 0;
//        int ans1 = 0;
//        for (int start = 0; start < 3; start++) {
//            for (int i = 0; i < 3; i++) {
//                if(list.get(start) + list.get(i) == target && i != start)
//                {
//                    ans = start;
//                    ans1 = i;
//                    list2.add(ans);
//                    list2.add(ans1);
//                    return list2;
//                }
//            }
//        }
//        return list;
//    }

}
