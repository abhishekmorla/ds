package com.morle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class plusoneonsubset {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n-->0) {
            int p = in.nextInt();
            ArrayList<Integer> list = new ArrayList<>(p);
            for (int i = 0; i < p; i++) {
                list.add(in.nextInt());
            }
            int min = Collections.min(list);
            int max = Collections.max(list);
            int diff = max - min;
            System.out.println(diff);
        }
    }
}
