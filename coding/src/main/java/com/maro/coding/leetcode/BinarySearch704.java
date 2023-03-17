package com.maro.coding.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BinarySearch704 {
    // https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
    public int binarySearch(int[] nums, int target){
        int halfLength = nums.length / 2;

        if(target == nums[halfLength]) {
            return halfLength;
        }
        return recursiveSearch(nums, target, halfLength);
    }
    public int recursiveSearch(int[] nums, int target, int halfLength){

        if(target > nums[halfLength]){
            if(target== nums[halfLength + (halfLength / 2)]) return halfLength + (halfLength / 2);
            return recursiveSearch( nums, target,halfLength/2);
        } else {
            if(target== nums[halfLength - (halfLength / 2)]) return halfLength - (halfLength / 2);
            return recursiveSearch( nums, target,halfLength/2);
        }
    }
}
