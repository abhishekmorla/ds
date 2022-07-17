package com.morle;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
public class infintiearray {
    public static void main(String[] args) {
        int[] arr= {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target= 10;
        int ans = ans(arr,target);
        System.out.println(ans);
    }
    static int ans(int[] arr , int tar)
    {
        //first find the range
        //first start with box 2
        int start = 0;
        int end = 1;
        while(tar > arr[end])
        {
            int newStart = end + 1;
            end = end + (end - start + 1 ) * 2 ;
            start = newStart;
        }
        return binarysearchs(arr , tar , start , end);
    }

    static int binarysearchs(int[] arr , int tar , int start , int end)
    {
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if(tar > arr[mid])
                start = mid+1;
            else if (tar < arr[mid])
                end = mid - 1;
            else{
                return mid;
            }
        }
        return -1;
    }
}
