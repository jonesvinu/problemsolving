package com.ps.app.leetcode;

public class Utility {

    public static void printArray(int[] output){
        for(int i = 0; i < output.length ; i++){
            System.out.print(output[i]);
            if(i != output.length -1) System.out.print(",");
        }
        System.out.println("");
    }
}
