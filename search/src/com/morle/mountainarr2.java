package com.morle;
//https://leetcode.com/problems/find-in-mountain-array/
public class mountainarr2 {
    public static void main(String[] args) {
        int[] arr = {10,11,20,22,21,2};
        int peak =  togetpeak(arr);
        int target = 2;
        int firsttry = binarysearchs(arr , target , 0 , peak);
        if(firsttry == -1)
        {
            System.out.println(binarysearchsd(arr , target , peak+1 , arr.length-1));
        }
        System.out.println(firsttry);
    }
    static int togetpeak(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while (start < end)
        {
            int mid = start + (end-start)/2;

            if(arr[mid] > arr[mid + 1] )
            // you are in dec part of array
                // this may be the ans , but look at left
            //this is why end!= mid - 1
                end = mid;
            else{
                // you are in as part of array

                start = mid + 1 ; // because we know that mid + 1 > mid
            }
        }
        // in the end start == end and pointing to largest number
        //at every point of time , we are finding the best possible largest number till that time.

        return end;
    }
    static int binarysearchs(int[] arr , int tar, int start , int end)
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
    static int binarysearchsd(int[] arr , int tar, int start , int end)
    {
        while (start <= end)
        {
            int mid = start + (end-start)/2;
            if(tar > arr[mid])
                end = mid-1;
            else if (tar < arr[mid])
                start = mid + 1;
            else{
                return mid;
            }
        }
        return -1;
    }
}

