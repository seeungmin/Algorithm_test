package com.company;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort implements Sort{
    // 삽입정렬
    @Override
    public int[] Sort(int[] array) {
        int n = array.length;
        int j, key;
        for (int i = 1; i < n; i++) {
            key = array[i];
            j = i-1;
            while((j > -1) && (array[j] > key)){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
        return array;
    }
}