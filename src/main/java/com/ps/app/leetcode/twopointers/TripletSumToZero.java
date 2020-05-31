package com.ps.app.leetcode.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.ps.app.leetcode.Utility.printArray;

public class TripletSumToZero {

    public static void main(String[] str){
        findTriplet(new int[]{-3, 0, 1, 2, -1, 1, -2}).stream().forEach(it -> printArray(it));
        System.out.println("---------------");
        findTriplet(new int[]{-5, 2, -1, -2, 3}).stream().forEach(it -> printArray(it));
    }

    public static List<int[]> findTriplet(int [] inputs){
        Arrays.sort(inputs);
        printArray(inputs);
        System.out.println("");

        List<int[]> outputs = new ArrayList<>();

        for(int i =0; i< inputs.length -2; i++){
            int left = i+1;
            int right = inputs.length-1;
            while(left < right) {
                int sum = inputs[i] + inputs[left] + inputs[right];
                if (sum == 0) {
                    outputs.add(new int[]{inputs[i], inputs[left], inputs[right]});
                    left++;
                    right--;
                } else if (sum > 0) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return (outputs);
    }
}
