/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        ListNode dummy=new ListNode(0);

        ListNode tail=dummy;
        ListNode current=head;
        tail.next=head;
        if (head == null || head.next == null || head.next.next == null) {
        return;
    }
        while(current!=null && current.next!=null && current.next.next!=null){
            ListNode runner=current;
            current=current.next;
            while (runner.next!=null){
                if(runner.next.next==null){
                    tail.next=runner.next;
                    tail=tail.next;
                    runner.next=null;
                    break;
                }
                runner=runner.next;
            }
            tail.next=current;
            tail=tail.next;
        }
        head.next=dummy.next;

    }
}