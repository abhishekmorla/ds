package com.morle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arrayformsum {
    public static void main(String[] args) {
        int[] arr = {9,9,9,9,9,9,9,9,9,9};
        int k = 181;
        System.out.println(addToArrayForm(arr,k));
    }
    public static List<Long> addToArrayForm(int[] num, int k) {
        List<Long> list1=new ArrayList<Long>(3);
        StringBuilder r=new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            r.append(num[i]);
        }
        long i = Long.parseLong(r.toString());
        long c = i + k;
        long f = i + k;
        int cp = 0;
        while (c>0)
        {
            long rem = c % 10;
            c = c /10;
            cp++;
        }
        System.out.println(cp);
        for (int j = 0; j < cp; j++) {
            while (f>0)
            {
                long rem = f % 10;
                f = f /10;
                list1.add(rem);
            }
        }
        Collections.reverse(list1);
        return list1;
    }
}
