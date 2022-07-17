package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class multiarray {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        //initialisation
        for (int i = 0; i < 3; i++) {
            list.add(new ArrayList<>());
        }
        //add
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                list.get(i).add(in.nextInt());
            }
        }
        System.out.println(list);
    }
}
