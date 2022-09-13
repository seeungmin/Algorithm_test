package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] arr = {3,4,2,9,5,4,2,1,6};
        PrintArray(arr);

        Sort sort = new InsertionSort();
        sort.Sort(arr);

        PrintArray(arr);
    }

    // 인트 배열 출력
    public static void PrintArray(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
