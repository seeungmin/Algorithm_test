package com.maro.coding.leetcode;

import org.springframework.stereotype.Component;

/*@Component
public class InputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target){
        int point = 0;
        int[] result = {0, 0};

        for(int i = 0; i < numbers.length-1; i++){
            for(int j = i+1; j < numbers.length; j++){
                if(numbers[i] + numbers[j] == target){
                    result[0] = i+1;
                    result[1] = j+1;
                    return result;
                }
            }
        }
        return null;
    }
}*/

@Component
public class InputArrayIsSorted167 {
    public int[] twoSum(int[] numbers, int target){
        int start = 0, end = numbers.length-1;
        int[] result = {0, 0};

        for (int i = 0; i < numbers.length;i++){
            if(numbers[start] + numbers[end] == target){
                result[0] = start+1;
                result[1] = end+1;
                return result;
            }
            else if (numbers[start] + numbers[end] < target) {
                start++;
            }
            else{
                end--;
            }
        }

        return null;
    }
}

