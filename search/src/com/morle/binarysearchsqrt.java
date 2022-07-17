package com.morle;

import java.util.Scanner;

public class binarysearchsqrt {
    public static void main(String[] args) {
        System.out.println(oode());
    }
    public static boolean oode(){
        //2147483647
        // if this comming and telling that TLE then use long in replace of int.
        int start = 0;
        Scanner in = new Scanner(System.in);
        int end = in.nextInt();
        int target = end;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            int check = mid*mid;
            if(check > target)
            {
                end = mid - 1;
            }
            else if(check < target)
            {
                start = mid + 1;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
