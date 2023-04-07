package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class MoveZeroes283 {
    public int[] moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }

        for(int j = index; j<nums.length; j++){
            nums[j] = 0;
        }

        return nums;
    }
}
