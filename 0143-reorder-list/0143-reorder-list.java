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
                // if (head == null || head.next == null || head.next.next == null) {
        //     return;
        // }

        // ListNode dummy=new ListNode(0);
        // ListNode tail=dummy;
        // ListNode current=head;
        // tail.next=head;

        // while(current!=null && current.next!=null && current.next.next!=null){
        //     ListNode runner=current;
        //     current=current.next;
        //     while (runner.next!=null){
        //         if(runner.next.next==null){
        //             tail.next=runner.next;
        //             tail=tail.next;
        //             runner.next=null;
        //             break;
        //         }
        //         runner=runner.next;
        //     }
        //     tail.next=current;
        //     tail=tail.next;
        // }
        // head=dummy.next;
        if(head==null || head.next==null){
            return;
        }

        ListNode slow=head;
        ListNode fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode prev=null;
        ListNode current=slow.next;
        slow.next=null;
        while(current!=null){
            ListNode next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }

        ListNode start=head;
        ListNode end=prev;
        while(end!=null){
            ListNode tempStart=start.next;
            ListNode tempPrev=end.next;
            start.next=end;
            end.next=tempStart;
            start=tempStart;
            end=tempPrev;
        }

    }
}