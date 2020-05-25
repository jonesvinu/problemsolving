package com.ps.app.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class MaximumFruitsInBasket {

    private  static final MaximumFruitsInBasket maxFruitsInBasket = null;

    private static MaximumFruitsInBasket getInstance(){
       return  maxFruitsInBasket != null ? maxFruitsInBasket : new MaximumFruitsInBasket();
    }

    public static void main(String[] str){
        Character[] n = new Character[]{'A', 'B', 'C', 'A', 'C'};
        int k =  getInstance().getMaxCount(n);
        System.out.println(k);
        n = new Character[] {'A', 'B', 'C', 'B', 'B', 'C'};
        k =  getInstance().getMaxCount(n);
        System.out.println(k);



    }

    public int getMaxCount(Character[] n){
        int windowStart = 0;
        int maxLength = 0;
        Map<Character,Integer> tracker = new HashMap<>();
        for(int windowEnd = 0; windowEnd < n.length ; windowEnd++){
            tracker.put(n[windowEnd],tracker.getOrDefault(n[windowEnd],0)+1);
            while (tracker.size() > 2){
                tracker.put(n[windowStart],tracker.get(n[windowStart])-1);
                if(tracker.get(n[windowStart]) == 0){
                    tracker.remove(n[windowStart]);
                }
                windowStart++;
            }
            maxLength = Math.max(maxLength,windowEnd-windowStart+1);
        }
        return maxLength;
    }

}
