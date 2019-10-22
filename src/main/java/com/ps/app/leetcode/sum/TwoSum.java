package com.ps.app.leetcode.sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
        for(int i =0;i < nums.length;i++){
            int difference = target - nums[i] ;
            Integer targetIndex = cache.get(nums[i]);
            if(targetIndex != null){
                return new int[]{targetIndex,i};
            }
            cache.put(difference,i);

        }
        return new int[]{};

    }

    public static void main(String[] str){
       int[] num = {2, 7, 11, 15};
       int[] result = new TwoSum().twoSum(num,9);
       Arrays.stream(result).boxed().collect(Collectors.<Integer>toList()).forEach(t -> System.out.println(t));
    }

}
