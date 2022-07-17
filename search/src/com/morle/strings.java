package com.morle;

import java.util.Arrays;

public class strings {
    public static void main(String[] args) {
        String name = "abhishekmorla";
        char target = 'm';
//        System.out.println(search(name , target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    static boolean search(String str,char tar) {
         if (str.length() == 0)
         {
             return false;
         }
        for (int i = 0; i < str.length(); i++) {
            if (tar == str.charAt(i))
            {
                return true;
            }
        }
        return false;
    }
    static boolean search2(String str,char tar) {
        if (str.length() == 0)
        {
            return false;
        }
        for (char ch : str.toCharArray())
        {
            if (ch == tar)
            {
                return true;
            }
        }
        return false;
    }
}
