package com.leetcode.day3;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int maxPower(String s) {
        s = s+ " ";
        Integer countValue = 0;
        int prevCount = 0;
        TreeMap<Character,Integer> count = new TreeMap<>();
        char letters[] =s.toCharArray();
        Character prev=letters[0];
        for(Character letter:letters){
            if(prev == letter){
                countValue = countValue + 1;
            } else {
                if(count.containsKey(prev)){
                    prevCount = count.get(prev);
                    if(prevCount > countValue){
                         countValue = prevCount;
                    }
                }
                count.put(prev,countValue);
                countValue = 1;
            }
            prev = letter;
        }
        if(count.isEmpty()){
            count.put(prev,countValue);
        }
        LinkedHashMap<Character,Integer> resultMap = count.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
        Object[] keys = resultMap.keySet().toArray();
        int len = keys.length>0?keys.length-1:0;
        Character letter = (Character)keys[len];
        return resultMap.get(letter);
    }
}
