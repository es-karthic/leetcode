package com.leetcode.day2;

import com.leetcode.base.BaseTestCase;
import com.leetcode.common.ListNode;
import org.junit.Test;

public class InsertionSortSolutionTest extends BaseTestCase {
    @Test
    public void testsolution(){
        Solution lnst = new Solution();
        ListNode result = lnst.insertionSortList(getInputNode("15230"));//"100100111000000"));
        System.out.println("result is "+result);
        while(result!=null){
            System.out.println(" value is "+result.val);
            result = result.next;
        }
    }
}
