package com.maro.coding.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SearchInsertPosition35Test {
    private SearchInsertPosition35 searchInsertPosition35 =new SearchInsertPosition35();

    @Test
    @DisplayName("제공된 예시 1")
    void example_1(){
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int output = searchInsertPosition35.searchInsert(nums, target);

        assertEquals(2,output);
    }

    @Test
    @DisplayName("제공된 예시 2")
    void example_2(){
        int[] nums = {1, 3, 5, 6};
        int target = 2;

        int output = searchInsertPosition35.searchInsert(nums, target);

        assertEquals(1,output);
    }

    @Test
    @DisplayName("제공된 예시 3")
    void example_3(){
        int[] nums = {1, 3, 5, 6};
        int target = 7;

        int output = searchInsertPosition35.searchInsert(nums, target);

        assertEquals(4,output);
    }
}
