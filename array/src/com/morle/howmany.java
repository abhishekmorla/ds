package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class howmany {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }


        for (int start = 0 ; start < 5 ; start++) {
            int count = 0;
            for (int i = 0; i < 5; i++) {
                if (list.get(i) < list.get(start) && i != start) {
                    count = count + 1;
                }
            }
            list2.add(count);
        }
        System.out.println(list2);
    }
}
