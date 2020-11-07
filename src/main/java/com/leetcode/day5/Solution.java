package com.leetcode.day5;

public class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int lo = 0, hi = (int) 1e6;
        while (hi > lo + 1) {
            int mid = lo + (hi - lo) / 2;
            if (ok(nums, mid, threshold)) {
                hi = mid;
            } else {
                lo = mid;
            }
        }
        return hi;
    }

    //Is sum of each 'num / mid' not greater than threshold?
    //FFFFF'T'TTTTTT
    private boolean ok(int[] nums, int mid, int threshold) {
        int res = 0;
        for (int n : nums) {
            res += (n + mid - 1) / mid;
        }
        return res <= threshold;
    }
}
