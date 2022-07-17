package com.morle;

import java.util.*;

public class goodpair {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(10);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }
        int cp = 0;
        //count the number of occurance in an array
        Set<Integer> distinct = new HashSet<>(list);
        for (int i: distinct) {
            int nooc = Collections.frequency(list, i);
            if (nooc > 0)
            {
                cp = cp + nooc*(nooc-1)/2;
            }
        }
        System.out.println(cp);
    }
}
