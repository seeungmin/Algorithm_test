package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MoveZeroes283Test {
    MoveZeroes283 moveZeroes283 = new MoveZeroes283();

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int[] nums = {0, 1, 0, 3, 12};

        int output[] = moveZeroes283.moveZeroes(nums);

        int result[] = {1, 3, 12, 0, 0};
        assertArrayEquals(result, output);
    }
    @Test
    @DisplayName("예시2 리스트에 값이 없으면 -1")
    void example_2() {
        int[] nums = {0};

        int output[] = moveZeroes283.moveZeroes(nums);

        int result[] = {0};
        assertArrayEquals(result, output);

    }

}
