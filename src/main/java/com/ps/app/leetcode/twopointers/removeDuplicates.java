package com.ps.app.leetcode.twopointers;

import static com.ps.app.leetcode.Utility.printArray;

public class removeDuplicates {

    public static void main(String[] str){
        printArray(removeDup(new int [] {2, 3, 3, 3, 6, 9, 9}));
        printArray(removeDup(new int [] {2, 2, 2, 11}));
    }

    static int[] removeDup(int [] inputs){
        int nonDuplicateIndex = 0;

        for(int i = 1 ; i < inputs.length ; i++){
            if(inputs[nonDuplicateIndex] != inputs[i]){
                nonDuplicateIndex ++;
                inputs[nonDuplicateIndex] = inputs[i];
            }
        }

        int [] outputs = new int[nonDuplicateIndex+1];
        for(int i = 0; i < outputs.length ; i ++){
            outputs[i] = inputs[i];
        }

        return  outputs;
    }


}
