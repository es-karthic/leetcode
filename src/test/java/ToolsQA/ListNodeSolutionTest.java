package ToolsQA;

import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class ListNodeSolutionTest {



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

    @Test
    public void testsolution(){
        ListNodeSolution lnst = new ListNodeSolution();
        int result = lnst.getDecimalValue(getInputNode("100100111000000"));//"100100111000000"));
        System.out.println("result is "+result);
        assertTrue("True",result==7);
    }
}
