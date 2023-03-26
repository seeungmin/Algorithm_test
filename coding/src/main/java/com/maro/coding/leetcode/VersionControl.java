package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

/* FirstBadVersion278 문제의 외부 api를 구현할 상위 클래스 */

@Component
public class VersionControl {
    int bad;

    public int setBad(int n){
        bad = (int)(Math.random()*n +1);
        this.bad = bad;
        return bad;
    }

    public boolean isBadVersion(int i) {

        if(i >= bad){
            return true;
        }
        return false;
    }
}
