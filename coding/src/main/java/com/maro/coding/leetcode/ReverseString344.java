package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class ReverseString344 {
    public char[] reverseString(char[] s) {
        int first = 0;
        int end = s.length-1;
        char temp;

        while(first<end){
            temp = s[first];
            s[first++] = s[end];
            s[end--] = temp;
        }

        return s;
    }
}
