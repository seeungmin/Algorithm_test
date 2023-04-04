package com.maro.coding.leetcode;

import java.util.Arrays;

public class SquaresOfASortedArray977 {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i< nums.length;i++) {
            nums[i] *= nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }
}
