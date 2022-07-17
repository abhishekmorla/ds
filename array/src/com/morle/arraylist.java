package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));
        }

        list.set(0,1337);
        System.out.println(list);

        //for 2d arraylist
        ArrayList<ArrayList<Integer>> list2d = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list2d.add(new ArrayList<>());
        }
        //adding elements
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                    list2d.get(i).add(in.nextInt());
            }
        }

    }

}
