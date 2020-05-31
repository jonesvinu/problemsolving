package com.ps.app.leetcode.twopointers;

import static com.ps.app.leetcode.Utility.printArray;

public class PairWithTarget {

    public static void main(String[] str){
        printArray(findPairWithSum(new int[]{1, 2, 3, 4, 6},6));
        printArray(findPairWithSum(new int[]{2, 5, 9, 11},11));
    }



    static int [] findPairWithSum(int[] inputs,int targetSum){
        int right = inputs.length -1;
        int left = 0;
        while (left != right){
            int sum = inputs[left] + inputs[right];
            if(sum == targetSum){
                return new int[]{inputs[left] , inputs[right]};
            }else if(sum < targetSum){
                left++;
            }else{
                right--;
            }

        }
        return new int[] {-1,-1};
    }
}
