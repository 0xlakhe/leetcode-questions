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
    public ListNode middleNode(ListNode head) {
        ListNode current=head;
        int index=0;
        while(current!=null){
            current=current.next;
            index++;
        }   
        int middle=index/2;
        int i=0;
        ListNode ans= new ListNode(0);
        ListNode curr=head;
        while(curr!=null){
            if(i==middle){
                ans.next=curr;
                break;
            }
            curr=curr.next;
            i+=1;
        }
        return ans.next;
    }
}