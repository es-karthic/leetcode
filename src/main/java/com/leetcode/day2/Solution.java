package com.leetcode.day2;

import com.leetcode.common.ListNode;

class Solution {


    public ListNode insertionSortList(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dummy = new ListNode(0);
        ListNode prev = dummy;
        while(head != null){
            ListNode temp = head.next;
            if(prev.val >= head.val){
                prev = dummy;
            }
            while(prev.next != null && prev.next.val < head.val){
                prev = prev.next;
            }
            head.next = prev.next;
            prev.next = head;
            head = temp;
        }
        return dummy.next;
    }

}
