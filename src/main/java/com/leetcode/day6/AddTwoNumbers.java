package com.leetcode.day6;

import com.leetcode.common.ListNode;

import java.util.Stack;

public class AddTwoNumbers {



    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode root, node;
        root = node = null;
        int digitFromInputOne;
        int digitFromInputTwo;
        int carryForword = 0;
        int sum = 0;
        int digit;
        Stack<Integer> one, two;
        one = new Stack<>();
        two = new Stack<>();
        while(l1!=null || l2!=null){
            if(l1!=null){
                one.push(l1.val);
                l1=l1.next;
            }
            if(l2!=null){
                two.push(l2.val);
                l2=l2.next;
            }
        }

        while(!one.isEmpty() || !two.isEmpty()){
            digitFromInputOne = 0;
            digitFromInputTwo = 0;
            if(!one.isEmpty()){
                digitFromInputOne = one.pop();
            }
            if(!two.isEmpty()) {
                digitFromInputTwo = two.pop();
            }
            digit = sum = digitFromInputOne + digitFromInputTwo + carryForword;
            carryForword = 0;

            if(sum > 9) {
                carryForword = sum/10;
                digit = sum%10;
            }
            node = new ListNode(digit,null);
            if(root == null){
                root = node;
            } else {
                node.next = root;
                root = node;
            }
        }
        if(carryForword>0){
            node = new ListNode(carryForword,root);
            root = node;
        }
        return root;
    }

}

