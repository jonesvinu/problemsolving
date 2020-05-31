package com.ps.app.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ps.app.leetcode.Utility.printArray;

public class TripletSumLessThanTarget {

    public static void main(String[] str){
        findTriplet(new int[] {-1,-1, 0, 2,2,2,2,2,3,3,3,3}, 3).stream().forEach(it -> printArray(it));
        System.out.println("------------");
        findTriplet(new int[] {-1, 4, 2, 1, 3}, 5).stream().forEach(it -> printArray(it));
    }

    public static List<int[]> findTriplet (int[] input , int targetSum){
         List<int[]> lists = new ArrayList<>();
         Arrays.sort(input);
         for(int i =0; i < input.length-2; i++){
            int left = i+1;
            int right = input.length-1;
            if(i> 0 && input[i] == input[i-1]){
                continue;
            }
            while(left < right){
                int sum = input[i] + input[left] + input[right];
                if(targetSum > sum){
                   int  rightValue = input[right];
                   lists.add(new int[] {input[i],input[left],input[right]})  ;
                   right--;
                   while (left < right && input[right] == input[right-1]){
                       right--;
                   }
                }else{
                    left++;
                    while (left < right && input[left] == input[left -1]){
                        left++;
                    }
                }
            }
         }
         return lists;
    }
}
