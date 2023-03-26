package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

@Component
public class FirstBadVersion278 extends VersionControl {
    // https://leetcode.com/problems/first-bad-version/?envType=study-plan&id=algorithm-i
    public int firstBadVersion(int n) {
        int first = 1;
        int end = n;
        int mid = 0;

        while(first < end){
            mid = first + (end - first)/2;

            if(isBadVersion(mid))
                end = mid;
            else
                first = mid + 1;
        }
        return first;
    }

}
