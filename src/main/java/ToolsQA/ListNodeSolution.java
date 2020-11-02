package ToolsQA;

public class ListNodeSolution {
    public int getDecimalValue(ListNode head) {
        int length = 0;
        int sum=0;
        int digit=0;
        int powerOf = 0;
        String value = "";
        while(head!=null){
            value = value+head.val;
            head = head.next;
            length++;
        }
        sum = Integer.parseInt(value,2);
        return sum;
    }


}
