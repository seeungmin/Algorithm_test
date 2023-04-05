package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class RotateArray189 {
    public int[] rotate(int[] nums, int k) {

        k %= nums.length;

        reverse(nums, 0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        return nums;
    }

    public void reverse(int[] nums, int start, int last){
        while(start < last){
            int temp = nums[start];
            nums[start++] = nums[last];
            nums[last--] = temp;
        }
    }
}
