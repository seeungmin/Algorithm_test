package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class InputArrayIsSortedTest167 {


    InputArrayIsSorted167 inputArrayIsSorted167 = new InputArrayIsSorted167();

    @Test
    @DisplayName("제공된 예시1")
    void example_1(){
        int[] input = {2, 7, 11, 15};
        int target = 9;

        int[] output = inputArrayIsSorted167.twoSum(input, target);

        int[] result = {1, 2};

        assertArrayEquals(result, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2(){
        int[] input = {2, 3, 4};
        int target = 6;

        int[] output = inputArrayIsSorted167.twoSum(input, target);

        int[] result = {1, 3};

        assertArrayEquals(result, output);
    }

    @Test
    @DisplayName("제공된 예시3")
    void example_3(){
        int[] input = {-1, 0};
        int target = -1;

        int[] output = inputArrayIsSorted167.twoSum(input, target);

        int[] result = {1, 2};

        assertArrayEquals(result, output);
    }
}
