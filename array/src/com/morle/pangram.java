package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class pangram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String aba = in.next();
        //removing all duplicate letters and then count if 26 its panagram.
        System.out.println(aba.replaceAll("(.)(?=.*\\1)", "").length() == 26);
    }
}
