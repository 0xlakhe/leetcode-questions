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
    public ListNode partition(ListNode head, int x) {

        if(head==null || head.next==null){
            return head;
        }
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode target=dummy.next;
        ListNode prev=dummy;
        while(target!=null && target.val<x){
            prev=target;
            target=target.next;
        }
        if(target==null){
            return head;
        }
        ListNode runnerPrev=target;
        ListNode runner=target.next;
        while(runner!=null){
            if(runner.val<x){
                runnerPrev.next=runner.next;
                prev.next=runner;
                prev=prev.next;
                prev.next=target;
                runner=runnerPrev.next;
            }else{
                runnerPrev=runnerPrev.next;
                runner=runner.next;
            }
        }
        return dummy.next;
    }
}