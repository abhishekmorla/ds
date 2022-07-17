package com.morle;

public class searchinsipos {
    public static void main(String[] args) {
        int[] arr = {1,5,10,12,14,15,16};
        int target = 13;
        int index =  binarysearchs(arr, target );
        System.out.println(index);
    }
    static int binarysearchs(int[] nums , int target)
    {
        int start = 0, end = nums.length - 1;
        while(start <= end)
        {
            int mid = start + (end - start) / 2;
            if(target > nums[mid]){
                start = mid + 1;
            }
            else if(target < nums[mid]){
                end = mid - 1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
}
