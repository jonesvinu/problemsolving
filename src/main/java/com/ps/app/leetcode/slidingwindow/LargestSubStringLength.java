package com.ps.app.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LargestSubStringLength {

    public static void main(String[] str){
        System.out.println(new LargestSubStringLength().lengthOfLongestSubstring("abcdecdfaghjklm"));
        System.out.println(new LargestSubStringLength().lengthOfLongestSubstring2("abcdecdfaghjklm"));
    }



    public int lengthOfLongestSubstring(String s) {
        int i =0,j=0,ans =0;
        int n = s.length();
        Set<Character> set = new HashSet<>();
        while(i < n &&  j < n ){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans,j-i);

            }else {
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }



    public int lengthOfLongestSubstring2(String s) {

        int n = s.length();
        Map<Character,Integer> map = new HashMap<>();
        int ans = 0;
        for(int windowStart = 0 ,windowEnd =0; windowEnd< n ; windowEnd++){
            if(map.containsKey(s.charAt(windowEnd))){
                windowStart = Math.max(map.get(s.charAt(windowEnd)),windowStart);
            }
            ans = Math.max(ans,windowEnd-windowStart+1);
            map.put(s.charAt(windowEnd), windowEnd+1);
        }
        return ans;
    }

}
