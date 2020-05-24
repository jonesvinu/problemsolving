package com.ps.app.leetcode.slidingwindow;

public class SmallestSubArrayWithSum {

    public static void main(String[] str){
        new SmallestSubArrayWithSum().getSmalletSubArray(new int[]{1,3,1,3,4,2}, 8);

    }


    public void getSmalletSubArray(int[] n, int sum){
        int windowStart = 0;
        int minLength = Integer.MAX_VALUE;
        int windowSum = 0;

        for( int windowEnd = 0;windowEnd < n.length ;windowEnd++ ){
            windowSum += n[windowEnd];
            if(windowSum >= sum){
                minLength = windowEnd - windowStart +1 < minLength  ? windowEnd - windowStart +1 : minLength;
                while(windowStart <= windowEnd) {
                    windowSum = windowSum - n[windowStart];
                    if (windowSum >= sum) {
                        minLength = windowEnd - windowStart  < minLength  ? windowEnd - windowStart  : minLength;
                        windowStart++;
                    } else {
                        windowStart++;
                        break;
                    }
                }
            }

        }

        System.out.println(minLength);


    }

}
