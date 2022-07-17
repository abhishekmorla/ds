package com.morle;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class HighestAltitude {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 7; i++) {
            list.add(in.nextInt());
        }
        int[] arr = list.stream().mapToInt(i -> i).toArray();
        System.out.println(largestAltitude(arr));
    }
    public static int largestAltitude(int[] gain) {
        ArrayList<Integer> list1 = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        int n = gain.length;
        for (int i = 0; i < n; i++) {
            list1.add(gain[i]);
        }
        int sum =0;
        for (int i = 0; i <n ; i++) {
            sum = sum + list1.get(i);
            list2.add(sum);
        }
        list2.add(0,0);
        return Collections.max(list2);
    }
}
