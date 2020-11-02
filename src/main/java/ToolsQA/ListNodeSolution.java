package ToolsQA;

public class ListNodeSolution {
    public int getDecimalValue(ListNode head) {
        if(head==null) return 0;

        int res=head.val;

        while(head.next!=null){
            System.out.println(res+" res value and "+" res * 2 is "+(res * 2)+" +head.next.val is "+ head.next.val+ " total result "+ ((res * 2)+head.next.val));
            res=res*2+ head.next.val;
            head=head.next;
        }
        return res;
    }


}
