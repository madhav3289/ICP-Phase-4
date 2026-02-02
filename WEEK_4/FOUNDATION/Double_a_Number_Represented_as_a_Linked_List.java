package WEEK_4.FOUNDATION;

public class Double_a_Number_Represented_as_a_Linked_List {
    public ListNode doubleIt(ListNode head) {
        ListNode tHead=solve(head);
        ListNode temp=tHead;
        ListNode prev=null;
        int rem=0;
        while(temp!=null){
            int d=temp.val*2+rem;
            temp.val=d%10;
            rem=(d>=10?1:0);
            prev=temp;
            temp=temp.next;
        }
        if(rem!=0){
            prev.next=new ListNode(rem);
        }
        return solve(tHead);
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
