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
    public ListNode rotateRight(ListNode head, int k) {

        //brute force
        // ListNode dummy=new ListNode(0);
        // dummy.next=head;
        // if(head==null){
        //     return dummy.next;
        // }
        // for(int i=0;i<k;i++){
        //     ListNode current=dummy.next;
        //     ListNode previous=dummy;
        //     while(current!=null && current.next!=null){
        //         previous=current;
        //         current=current.next;
        //     }
        //     previous.next=null;
        //     current.next=dummy.next;
        //     dummy.next=current;
        // }
        // return dummy.next;

        if(head==null || head.next==null){
            return head;
        }

        int count=1;
        ListNode dummy= new ListNode(0);
        dummy.next=head;
        ListNode current=head;
        while(current.next!=null){
            count+=1;
            current=current.next;
        }
        if(k%count==0){
            return dummy.next;
        }
        current.next=dummy.next;

        return node(dummy.next,count-(k%count)-1);
    }

    private ListNode node(ListNode head, int k){
        ListNode current=head;
        while(k>0){
            current=current.next;
            k--;
        }
        head=current.next;
        current.next=null;
        return head;
    }
}