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
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode previous=dummy;
        while(previous!=null && previous.next!=null){
            ListNode current= previous.next;
            while (current!=null&&current.val==val){
                current=current.next;
                
            }
            previous.next=current;
            previous=previous.next;
        }
        return dummy.next;
    }


}