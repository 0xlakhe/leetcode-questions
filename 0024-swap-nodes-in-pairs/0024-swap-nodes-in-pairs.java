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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(0);

        ListNode ans=helper(head,dummy);
        return ans;

    }
    public ListNode helper(ListNode head,ListNode dummy){
        if(head==null || head.next==null){
            return head;
        }
        ListNode first=head;
        ListNode second=head.next;
        first.next=second.next;
        second.next=first;
        dummy.next=second;
        ListNode ans=helper(first.next,first);
        return dummy.next;
    }
}