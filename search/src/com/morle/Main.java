package com.morle;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,6,345};
        Scanner in = new Scanner(System.in);
        int target = in.nextInt();
        int ans=linearsearch(nums , target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr , int target)
    {
        if (arr.length == 0)
        {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]){
                return i;
            }
        }

        return -1;
    }
}
