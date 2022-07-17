package com.morle;
//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/submissions/
import java.util.Scanner;

public class evendigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
//        for (int i = 0; i < 5; i++) {
//            nums[i] = in.nextInt();
//        }
        int ans = findnumbers2(nums);
        System.out.println(digits3(111));
    }
    static int findNumbers(int[] nums) {
        int n = nums.length;
        int flag = 0;
        for (int i = 0; i < n; i++) {
            int oode = nums[i];
            int c = 0;
            while (oode > 0)
            {
                oode = oode / 10;
                c++;
            }
            if (c % 2 == 0) {
                flag++;
            }
        }
        return flag;
    }
    static int findnumbers2(int[] nums)
    {
        // for only counting the even number
        int count = 0;
        for (int i : nums) {
            if (even(i))
            {
                count++;
            }
        }
        return count;
    }
    static int digits(int oode)
    {
        // it will count the number of digits
        int count = 0;
        while (oode > 0)
        {
            oode = oode / 10;
            count++;
        }
        return count;
    }
    static int digits2(int oode)
    {
        // it will count the number of digits
        String s = "" + oode; //for convering int to string
        return s.length();
    }
    static int digits3(int oode)
    {
        return (int)(Math.log10(oode)) + 1;
    }

     static boolean even(int i) {
        // tell if its even or not.
        int nuofd = digits(i);
         return nuofd % 2 == 0;
     }

}
