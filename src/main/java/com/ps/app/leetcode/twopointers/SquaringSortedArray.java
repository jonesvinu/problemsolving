package com.ps.app.leetcode.twopointers;

import static com.ps.app.leetcode.Utility.printArray;

public class SquaringSortedArray {

    public static void main(String[] str){
        printArray(squareSort(new int[] {-2, -1, 0, 2, 3}));
        printArray(squareSort(new int[] {-3, -1, 0, 1, 2}));
    }

    static int[] squareSort(int[] inputs){
        int left = 0;
        int[] squares = new int[inputs.length];
        int right = inputs.length -1;
        int maxIndex = inputs.length -1;
        while(left != right){
            int leftSquare = inputs[left] * inputs[left];
            int rightSquare = inputs[right] * inputs[right];
            if(leftSquare < rightSquare){
                squares[maxIndex] = rightSquare;
                right--;
            }else{
                squares[maxIndex] = leftSquare;
                left++;
            }
            maxIndex--;
        }

        return squares;
    }
}
