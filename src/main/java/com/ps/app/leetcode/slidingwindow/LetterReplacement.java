package com.ps.app.leetcode.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LetterReplacement {
    private  static final LetterReplacement instance = null;

    private static LetterReplacement getInstance(){
        return  instance != null ? instance : new LetterReplacement();
    }

    public static void main(String[] str){
        System.out.println(getInstance().getMaxLength("aabccbb",2));
        System.out.println(getInstance().getMaxLength("abbcb",1));
        System.out.println(getInstance().getMaxLength("abccde",1));
    }

    public int getMaxLength(String input,int k){
        Character[] characters = input.chars().mapToObj(c -> (char) c).toArray(Character[]::new);
        int maxLength = 0;
        int windowStart = 0;
        int maxLetter = 0;

        Map<Character,Integer> tracker = new HashMap<>();
        for(int windowEnd = 0; windowEnd < characters.length ; windowEnd++){
            tracker.put(characters[windowEnd],tracker.getOrDefault(characters[windowEnd],0)+1);
            maxLetter = Math.max(maxLetter,tracker.get(characters[windowEnd]));
            while(windowEnd -windowStart + 1 - maxLetter > k ){
                tracker.put(characters[windowStart],tracker.get(characters[windowStart])-1) ;
                windowStart++;
            }

            maxLength = Math.max(maxLength,windowEnd-windowStart +1);
        }
        return maxLength;
    }



}
