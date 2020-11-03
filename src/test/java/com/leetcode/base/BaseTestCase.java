package com.leetcode.base;

import com.leetcode.common.ListNode;

public class BaseTestCase {
    public ListNode getInputNode(String input){
        ListNode head = new ListNode();
        ListNode ln = head;
        while(input.length()>0){
            ln.val = Integer.parseInt(input.substring(0,1));
            input = input.substring(1);
            if("".equals(input)==false){
                ln.next = new ListNode();
                ln = ln.next;
            }
        }
        return head;
    }
}
