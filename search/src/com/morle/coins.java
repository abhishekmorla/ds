package com.morle;

import java.util.Scanner;

public class coins {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(arrangeCoins(n));
    }
    public static int arrangeCoins(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
            if (sum >= n)
            {
                return i-1;
            }
        }
        return 0;
    }
}
