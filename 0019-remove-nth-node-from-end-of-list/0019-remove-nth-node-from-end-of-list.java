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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // ListNode first=head;
        // ListNode second =head;
        // int count=0;
        // if(head.next==null){
        //     return head=head.next;
        // }

        // if(head.next.next==null){
        //     head.next=null;
        //     return head;
        // }
        // while(count<=(n+1)){
        //     if(count==n){
        //         second=first;
        //     }
        //     if(count>n){
        //         second.next=first.next;
        //         break;
        //     }
        //     first=first.next;
        //     count+=1;
        // }
        // return head;
        if(head.next==null){
            return head=head.next;
        }

        // if(head.next.next==null){
        //     if(n==1){
        //         head.next=null;
        //     }else if(n==2){
        //         ListNode dummy= new ListNode(0);

        //         dummy.next=head;
        //         head.next=null;
        //         return dummy.next;
        //     }
        //     return head;
        // }
        ListNode dummy=new ListNode(0);
        dummy.next=head;

        int count=0;
        ListNode current=head;
        while(current!=null){
            current=current.next;
            count+=1;
        }
        int index=count-n;

        ListNode previous=dummy;

        while(index>0){
            previous=previous.next;
            index--;
        }
        previous.next=previous.next.next;
        return dummy.next;
    }
}
