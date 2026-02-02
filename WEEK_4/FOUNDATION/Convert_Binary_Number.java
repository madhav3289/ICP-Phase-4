package WEEK_4.FOUNDATION;

public class Convert_Binary_Number {
    public int getDecimalValue(ListNode head) {
        ListNode newHead=solve(head);
        int result=0;
        int p=0;
        while(newHead!=null){
            int d=newHead.val;
            if(d==1){
                result+=(int)Math.pow(2,p);
            }
            p++;
            newHead=newHead.next;
        }
        return result;
    }
    public static ListNode solve(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode last=solve(head.next);
        head.next.next=head;
        head.next=null;
        return last;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}