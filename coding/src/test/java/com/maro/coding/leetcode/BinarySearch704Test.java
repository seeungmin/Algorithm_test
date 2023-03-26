package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinarySearch704Test {
    private BinarySearch704 binarySearch = new BinarySearch704();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 9;

        int output = binarySearch.search(nums, target);

        assertEquals(4, output);
    }
    @Test
    @DisplayName("예시2 리스트에 값이 없으면 -1")
    void example_2() {
        int[] nums = {-1,0,3,5,9,12};
        int target = 2;

        int output = binarySearch.search(nums, target);

        assertEquals(-1, output);
    }

}
