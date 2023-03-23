package com.maro.coding.leetcode;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FirstBadVersion278Test {
    FirstBadVersion278 firstBadVersion = new FirstBadVersion278();

    /* 문제에 api가 있는거로 가정하는데 이건 어케 테스트하지..? */
    @Test
    @DisplayName("제공된 예시1")
    void example_1() {
        int n = 5;
        firstBadVersion.setBad(4);

        int output = firstBadVersion.firstBadVersion(n);

        assertEquals(4, output);
    }

    @Test
    @DisplayName("제공된 예시2")
    void example_2() {
        int n = 1;
        firstBadVersion.setBad(1);

        int output = firstBadVersion.firstBadVersion(n);

        assertEquals(1, output);
    }

    @Test
    @DisplayName("테스트 케이스 1 : 엄청 큰 n값")
    void example_3() {
        int n = 100000000;
        firstBadVersion.setBad(9876543);

        int output = firstBadVersion.firstBadVersion(n);

        assertEquals(9876543, output);
    }

    @Test
    @DisplayName("테스트 케이스 2 : 엄청 큰 n값")
    void example_4() {
        int n = 1000000000;
        firstBadVersion.setBad(987654553);

        int output = firstBadVersion.firstBadVersion(n);

        assertEquals(987654553, output);
    }


}
