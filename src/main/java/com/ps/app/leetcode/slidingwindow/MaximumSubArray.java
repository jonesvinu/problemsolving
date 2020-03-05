package com.ps.app.leetcode.slidingwindow;

public class MaximumSubArray {

    public static void main(String[] str){
        System.out.println(new MaximumSubArray().maximumSubArray(new int[] {1 ,2 ,3 ,4 ,5,6},3));

    }

    int maximumSubArray(int[] array,int k){
        int windowSum = 0;
        int maxSum = 0;
        int i = 0;

        for(int j =0; j < array.length ; j++){
            windowSum += array[j];
            if(j >= k -1){
                maxSum = Math.max(windowSum,maxSum);
                windowSum -= array[i];
                i++;
            }
        }
        return maxSum;
    }

}
