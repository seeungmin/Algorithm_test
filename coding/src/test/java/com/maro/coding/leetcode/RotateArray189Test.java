package com.maro.coding.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RotateArray189Test {
    RotateArray189 rotateArray189 = new RotateArray189();

    @Test
    @DisplayName("제공된 예시1")
    void example_1(){
        int[] input = {1, 2, 3, 4, 5 ,6, 7};
        int rotate_num = 3;

        int[] output = rotateArray189.rotate(input, rotate_num);

        int ret[] = {5, 6, 7, 1, 2, 3, 4};
        Assertions.assertArrayEquals(ret, output);
    }
    @Test
    @DisplayName("제공된 예시2")
    void example_2(){
        int[] input = {-1, -100, 3, 99};
        int rotate_num = 2;

        int[] output = rotateArray189.rotate(input, rotate_num);

        int ret[] = {3, 99, -1, -100};
        Assertions.assertArrayEquals(ret, output);
    }

    @Test
    @DisplayName("제공된 예시3")
    void example_3(){
        int[] input = {-1};
        int rotate_num = 2;

        int[] output = rotateArray189.rotate(input, rotate_num);

        int ret[] = {-1};
        Assertions.assertArrayEquals(ret, output);
    }
}
