package com.morle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class shufflearray {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        ArrayList<Integer> list4 = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
        }
        int m = list.size();
        int n = m/2;
        for (int i = 0; i < n; i++) {
            list2.add(list.get(i));
        }
        for (int i = n; i < m; i++) {
            list3.add(list.get(i));
        }
        for (int i = 0; i < n; i++) {
            list4.add(list2.get(i));
            list4.add(list3.get(i));
        }
        System.out.println(list2);
        System.out.println(list3);
        System.out.println(list4);



    }
}
