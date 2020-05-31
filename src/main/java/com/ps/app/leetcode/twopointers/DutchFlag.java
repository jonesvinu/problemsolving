package com.ps.app.leetcode.twopointers;

import static com.ps.app.leetcode.Utility.printArray;

public class DutchFlag {

    public static void main (String[] str){
        printArray(sort (new int[]{1, 0, 2, 1, 0}));
        printArray(sort (new int[]{2, 2, 0, 1, 2, 0}));
    }

    static int[] sort(int[] inputs){
        int low = 0;
        int high = inputs.length-1;
        for(int i = 0; i < high ;){
            if(inputs[i] == 0){
                swap(inputs ,i, low);
                i++;
                low++;
            }else if (inputs[i] == 1){
                i++;
            }else {
                swap(inputs, i, high);
                high--;
            }
        }
        return inputs;
    }

    private static void swap (int[] inputs, int i, int j){
        int temp = inputs[i];
        inputs[i] = inputs[j];
        inputs[j] = temp;
    }
}
