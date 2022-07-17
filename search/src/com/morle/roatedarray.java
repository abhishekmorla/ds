package com.morle;

public class roatedarray {
    public static void main(String[] args) {
        int[] arr = {5,1,3};
        System.out.println(findpivot(arr));
    }

    static int search(int[] nums, int target) {
        int pivot = findpivot(nums);
        // if you did not
        // find a pivot it means array is not rotde
        if (pivot == -1) {
            return binarysearchs(nums, target, 0, nums.length - 1);
        }
        if (nums[pivot] == target) {
            return pivot;
        }
        if (target >= nums[0])
        {
            return binarysearchs(nums , target , 0 , pivot-1);
        }
        return binarysearchs(nums , target , pivot+1 , nums.length-1);
    }
    static int binarysearchs(int[] arr , int tar,int start,int end)
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

    static int findpivot(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            //4 cases
            if (mid < end && arr[mid] > arr[mid+1])
            {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid+1])
            {
                return mid-1;
            }
            if(arr[mid] <= arr[start])
            {
                end = mid-1;
            }
            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
