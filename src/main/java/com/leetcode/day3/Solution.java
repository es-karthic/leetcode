package com.leetcode.day3;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public int maxPower(String s) {
        if(s.length() == 1)
            return 1;

        int max = 1;
        int currMax = 1;

        for(int i  = 1; i < s.length(); i++){
            if(s.charAt(i) == s.charAt(i-1)){
                currMax++;
            }
            else{
                currMax = 1;
            }

            if(currMax > max)
                max = currMax;
        }

        return max;

    }
}
