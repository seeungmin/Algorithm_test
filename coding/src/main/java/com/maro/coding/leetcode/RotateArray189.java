package com.maro.coding.leetcode;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);
    }

    public void reverse(int[] nums, int start, int last){
        while(start < last){
            int temp = nums[start];
            nums[start++] = nums[last];
            nums[last--] = temp;
        }
    }
}
