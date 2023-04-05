package com.maro.coding.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class SquaresOfASortedArray977Test {

    SquaresOfASortedArray977 squaresOfASortedArray977 = new SquaresOfASortedArray977();

    @Test
    @DisplayName("제공된 예시1")
    void example_1(){
        int nums[] = {-4, -1, 0, 3, 10};

        int[] output = squaresOfASortedArray977.sortedSquares(nums);

        int[] ret = {0,1,9,16,100};
        Assertions.assertArrayEquals(ret, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2(){
        int nums[] = {-7, -3, 2, 3, 11};

        int[] output = squaresOfASortedArray977.sortedSquares(nums);

        int[] ret = {4, 9, 9, 49, 121};
        Assertions.assertArrayEquals(ret, output);
    }
}
