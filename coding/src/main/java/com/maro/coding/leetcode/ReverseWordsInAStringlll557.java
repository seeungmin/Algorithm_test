package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class ReverseWordsInAStringlll557 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s");
        StringBuffer string = new StringBuffer();

        for(int i = 0; i< words.length; i ++){
            StringBuffer ss = new StringBuffer(words[i]);
            if(i == words.length-1){
                string.append(ss.reverse());
                break;
            }
            string.append(ss.reverse()+" ");
        }
        s = string.toString();

        return s;
    }
}
