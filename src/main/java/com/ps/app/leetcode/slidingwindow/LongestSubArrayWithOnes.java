package com.ps.app.leetcode.slidingwindow;

public class LongestSubArrayWithOnes {

    private  static final LongestSubArrayWithOnes instance = null;

    private static LongestSubArrayWithOnes getInstance(){
        return  instance != null ? instance : new LongestSubArrayWithOnes();
    }

    public static void main (String[] str){
        System.out.println(getInstance().findMaxLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1},2));
    }

    public int findMaxLength(int[] n, int k){

        int windowStart = 0;
        int maxLength = 0;
        int countOfOnes = 0;
        for(int windowEnd =0; windowEnd < n.length ; windowEnd++){
            if(n[windowEnd] == 1){
                countOfOnes++;
            }
            if(windowEnd - windowStart + 1 - countOfOnes > k){
                if(n[windowStart] == 1) {
                    countOfOnes--;
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd - windowStart +1);
        }
        return maxLength;
    }

}
