package com.leetcode.day6;

import com.leetcode.common.ListNode;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AddTwoNumbersSolution {

    @Test
    public void testInputOne(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode inputOne = new ListNode(7,new ListNode(2,new ListNode(4,new ListNode(3,null))));
        ListNode inputTwo = new ListNode(5,new ListNode(6,new ListNode(4,null)));
        ListNode result = addTwoNumbers.addTwoNumbers(inputOne,inputTwo);
        String resultStr = "";
        while(result!=null){
            resultStr = resultStr+result.val;
            result = result.next;
        }
        assertTrue("True condition","7807".equals(resultStr));
    }

    @Test
    public void testInputTwo(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode inputOne = new ListNode(0);
        ListNode inputTwo = new ListNode(0,null);
        ListNode result = addTwoNumbers.addTwoNumbers(inputOne,inputTwo);
        String resultStr = "";
        while(result!=null){
            resultStr = resultStr+result.val;
            result = result.next;
        }
        assertTrue("True condition","0".equals(resultStr));
    }

    @Test
    public void testInputThree(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode inputOne = new ListNode(3, new ListNode(9,new ListNode(9,null)));
        ListNode inputTwo = new ListNode(7,null);
        ListNode result = addTwoNumbers.addTwoNumbers(inputOne,inputTwo);
        String resultStr = "";
        while(result!=null){
            resultStr = resultStr+result.val;
            result = result.next;
        }
        assertTrue("True condition","406".equals(resultStr));
    }

    @Test
    public void testInputFour(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode inputOne = new ListNode(3, new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))))))))));
        ListNode inputTwo = new ListNode(7,null);
        ListNode result = addTwoNumbers.addTwoNumbers(inputOne,inputTwo);
        String resultStr = "";
        while(result!=null){
            resultStr = resultStr+result.val;
            result = result.next;
        }
        assertTrue("True condition","4000000006".equals(resultStr));
    }

    @Test
    public void testInputFive(){
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode inputOne = new ListNode(5, null);//new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,null))))))))));
        ListNode inputTwo = new ListNode(5,null);
        ListNode result = addTwoNumbers.addTwoNumbers(inputOne,inputTwo);
        String resultStr = "";
        while(result!=null){
            resultStr = resultStr+result.val;
            result = result.next;
        }
        assertTrue("True condition","10".equals(resultStr));
    }
}
