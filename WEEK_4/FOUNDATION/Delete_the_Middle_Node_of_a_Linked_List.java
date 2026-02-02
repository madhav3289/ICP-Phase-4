package WEEK_4.FOUNDATION;

public class Delete_the_Middle_Node_of_a_Linked_List {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        ListNode temp=slow;
        while(fast!=null && fast.next!=null){
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(temp==slow){
            return null;
        }
        temp.next=slow.next;
        slow.next=null;
        return head;
    }
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}