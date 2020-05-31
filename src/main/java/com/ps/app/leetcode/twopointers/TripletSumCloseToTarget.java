package com.ps.app.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ps.app.leetcode.Utility.printArray;

public class TripletSumCloseToTarget {

    public static void main(String[] str){
        printArray(findTriplet(new int[]{-2, 0, 1, 2},2));
        printArray(findTriplet(new int[]{-3, -1, 1, 2},1));
        printArray(findTriplet(new int[]{1, 0, 1, 1},100));

    }

    public static int[] findTriplet(int [] inputs,int targetSum){
        Arrays.sort(inputs);

        int[] output = new int[3];
        int minValue = Integer.MAX_VALUE;

        for(int i =0; i< inputs.length -2; i++){
            int left = i+1;
            int right = inputs.length-1;
            while(left < right) {
                int sum = inputs[i] + inputs[left] + inputs[right];
                int diff = Math.abs(targetSum - sum);
                if (diff == 0) {
                    return  new int[]{inputs[i], inputs[left], inputs[right]};
                }

                if (diff < minValue) {
                    minValue = diff;
                    output = new int[]{inputs[i], inputs[left], inputs[right]};
                }

                if(targetSum - sum > 0){
                    left++;
                }else{
                    right--;
                }

            }
        }
        return output;
    }
}
