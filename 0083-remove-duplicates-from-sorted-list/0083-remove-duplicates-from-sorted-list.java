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
    public ListNode deleteDuplicates(ListNode head) {
        // ListNode dummy=new ListNode(0);
        // dummy.next=head;
        // ListNode prev=dummy.next;

        // while(prev!=null){
        //     if(prev!=null && prev.next!=null && prev.val==prev.next.val){
        //         int dup=prev.val;
        //         ListNode current=prev;
        //         while(current!=null && dup==current.val){
        //             current=current.next;
        //         }
        //         prev.next=current;
        //     }else{
        //         prev=prev.next;
        //     }
        // }
        // return dummy.next;

        if(head==null || head.next==null){
            return head;
        }
        ListNode current=head;
        while(current.next!=null){
            if(current.val==current.next.val){
                current.next=current.next.next;
            }else{
                current=current.next;
            }
        }
        return head;
    }
}