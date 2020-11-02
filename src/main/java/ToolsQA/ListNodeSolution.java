package ToolsQA;

public class ListNodeSolution {
    public int getDecimalValue(ListNode head) {
        int length = 0;
        long sum=0;
        int digit=0;
        int powerOf = 0;
        String value = "";
        while(head!=null){
            value = value+head.val;
            head = head.next;
            length++;
        }
        int result;
        while(value.length()>0){
            digit = Integer.parseInt(value.substring(value.length()-1));
            result = (int) Math.pow(2,powerOf);
            sum = sum + (digit * result);
            value = value.substring(0,value.length()-1);
            powerOf++;
        }


        return (int)sum;

    }


}
