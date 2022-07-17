package com.morle;

public class bsusingrec {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int target = 20;
        System.out.println(bsusingre(arr , target , 0 ,arr.length - 1));
    }

    public static int bsusingre(int[] arr, int target, int s, int e) {
        if (s > e)
        {
            return -1;
        }
        int m = s + (e - s )/2;
        if (arr[m] == target)
        {
            return m;
        }
        if (arr[m] > target)
        {
            return bsusingre(arr, target, s, m + 1);
        }
        return bsusingre(arr, target, m -1, e);
    }


}
