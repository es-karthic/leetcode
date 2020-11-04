package com.leetcode.day3;

import org.junit.Test;
import static org.junit.Assert.assertTrue;


public class SolutionTest {

    @Test
    public void testPositiveSolution1(){
        Solution solution = new Solution();
        assertTrue("leetcode",2==solution.maxPower("leetcode"));
    }

    @Test
    public void testPositiveSolution2(){
        Solution solution = new Solution();
        assertTrue("leetcode",5==solution.maxPower("triplepillooooow"));
    }

    @Test
    public void testPositiveSolution3(){
        Solution solution = new Solution();
        assertTrue("leetcode",5==solution.maxPower("abbcccddddeeeeedcba"));
    }

    @Test
    public void testPositiveSolution4(){
        Solution solution = new Solution();
        assertTrue("leetcode",11==solution.maxPower("hooraaaaaaaaaaay"));
    }

    @Test
    public void testPositiveSolution5(){
        Solution solution = new Solution();
        assertTrue("leetcode",1==solution.maxPower("tourist"));
    }


    @Test
    public void testPositiveSolution6(){
        Solution solution = new Solution();
        assertTrue("j",1==solution.maxPower("j"));
    }
    @Test
    public void testPositiveSolution7(){
        Solution solution = new Solution();
        assertTrue("j",2==solution.maxPower("cc"));
    }

    @Test
    public void testPositiveSolution8(){
        Solution solution = new Solution();
        assertTrue("j",8==solution.maxPower("aabbbbbccccdddddddeffffffggghhhhhiiiiijjjkkkkkllllmmmmmnnnnnoopppqrrrrsssttttuuuuvvvvwwwwwwwxxxxxyyyzzzzzzzz"));
    }
}
