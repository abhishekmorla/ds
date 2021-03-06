package com.morle;

import java.util.ArrayList;
import java.util.Scanner;

public class kthmissing {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            list.add(in.nextInt());
        }
        int k = in.nextInt();
        int[] arr = list.stream().mapToInt(i -> i).toArray();
//        System.out.println(findKthPositive(arr,k));
//        System.out.println(binse(arr,k));
//        System.out.println(countmissing(arr));
    }
    public static int binse(int[] arr , int k )
    {
        int start = 0;
        int end = arr.length-1;
        while (start<=end)
        {
            int mid = start + (end-start)/2;
            if (countmissing(arr[mid],mid+1) < k)
            {
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        //if start == -1
        if (start == -1)
        {
            return k;
        }
        return arr[end] + k - countmissing(arr[end] , end + 1);
    }
    public static int countmissing(int actual , int expect)
    {
        return actual - expect;
    }


    public static int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>(5);
        ArrayList<Integer> list2 = new ArrayList<>(5);
        ArrayList<Integer> list3 = new ArrayList<>(5);
        for (int j = 0; j < arr.length; j++) { //that will not equal to minus one
            list.add(arr[j]);
        }
        int last = list.get(list.size()-1);
        int indexoutbount = list.size()-1;
        if (list.get(0) != 1)
        {
            int lim = list.get(0) - 1;
            for (int i = 1; i <= lim; i++) {
                list3.add(i);
            }
        }
        for (int i = 0; i <k+last; i++) {
                if (i < indexoutbount)
                {
                    int diff = list.get(i+1) - list.get(i) - 1;
                    if (diff!=0)
                    {
                        for (int j = 1; j <= diff; j++) {
                            list3.add(list.get(i)+j);
                        }
                    }
                }
            }
        for (int i = last+1; i <= k+last; i++) {
            list3.add(i);
        }
        System.out.println(list3.get(k-1));
        return 0;
   }
}
