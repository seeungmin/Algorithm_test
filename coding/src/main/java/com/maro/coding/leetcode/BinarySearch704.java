package com.maro.coding.leetcode;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class BinarySearch704 {
    // https://leetcode.com/problems/binary-search/?envType=study-plan&id=algorithm-i
    public int binarySearch(int[] nums, int target){
        int start = 0;
        int end = nums.length-1;
        int mid = 0;

        while (true){
            if (start > end){
                return -1;
            }
            mid= (start+end)/2;
            if(target == nums[mid]){
                return mid;
            }
            if(target > nums[mid]){
                start = mid +1;
            } else if (target < nums[mid]) {
                end = mid -1;
            }
        }
    }
}
