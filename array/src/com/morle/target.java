package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class target {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(5);
        ArrayList<Integer> index = new ArrayList<>(5);
        ArrayList<Integer> target = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            nums.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            index.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            target.add(index.get(i) , nums.get(i));
        }
        System.out.println(target);

    }
}
