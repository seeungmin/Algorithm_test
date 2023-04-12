package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
public class ReverseString344Test {

    @Autowired
    ReverseString344 reverseString344;

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        char[] input = {'h', 'e', 'l', 'l', 'o'};

        char[] output = reverseString344.reverseString(input);

        char[] result = {'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(result, output);
    }
    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        char[] input = {'H', 'a', 'n', 'n', 'a', 'h'};

        char[] output = reverseString344.reverseString(input);

        char[] result = {'h', 'a', 'n', 'n', 'a', 'H'};
        assertArrayEquals(result, output);
    }
}
