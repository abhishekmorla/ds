package com.morle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class kidscandy {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Boolean> list2 =  new ArrayList<Boolean>();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        int extra = in.nextInt();
        for (int i = 0; i < 5; i++) {
            list1.add(list.get(i) + extra);
        }
        System.out.println(list1);
        Integer k = Collections.max(list);
        System.out.println(k);
        for (int i = 0; i < 5; i++) {
            if (k > list1.get(i))
            {
                list2.add(false);
            }
            else{
                list2.add(true);
            }
        }
        System.out.println(list2);
    }
}
