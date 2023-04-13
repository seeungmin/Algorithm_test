package com.maro.coding.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ReverseWordsInAStringlll557Test {

    @Autowired
    ReverseWordsInAStringlll557 reverseWordsInAStringlll557;

    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        String input = "Let's take LeetCode contest";

        String output = reverseWordsInAStringlll557.reverseWords(input);

        String result = "s'teL ekat edoCteeL tsetnoc";
        Assertions.assertEquals(result, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        String input = "God Ding";

        String output = reverseWordsInAStringlll557.reverseWords(input);

        String result = "doG gniD";
        Assertions.assertEquals(result, output);
    }
}
