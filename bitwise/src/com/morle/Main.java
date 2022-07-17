package com.morle;

public class Main {

    public static void main(String[] args) {
        int[] arr = {2,3,4,1,2,1,3,6,4};
        int ans = nonduplicate(arr);
        System.out.println(ans);
    }

    public static int nonduplicate(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i]; //a ^ a =
        }
        return result;
    }

}
