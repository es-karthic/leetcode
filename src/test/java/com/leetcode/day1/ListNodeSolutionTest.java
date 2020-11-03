package com.leetcode.day1;

import com.leetcode.base.BaseTestCase;
import com.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ListNodeSolutionTest extends BaseTestCase {


    @Test
    public void testsolution(){
        ListNodeSolution lnst = new ListNodeSolution();
        int result = lnst.getDecimalValue(getInputNode("100100111000000"));//"100100111000000"));
        System.out.println("result is "+result);
        assertTrue("True",result==7);
    }
}
