package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class SearchInsertPosition35 {
    // https://leetcode.com/problems/search-insert-position/description/
    public int searchInsert(int[] nums, int target) {
        int first = 0;
        int end = nums.length - 1;
        int mid;

        while(first <= end){
            mid = (first + end) / 2;

            if(nums[mid] == target)
                return mid;
            else if(target < nums[mid])
                end = mid - 1;
            else
                first = mid + 1;
        }
        return first;
    }
}
