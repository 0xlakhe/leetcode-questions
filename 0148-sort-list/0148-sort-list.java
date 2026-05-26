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

    public ListNode sortList(ListNode head) {
        
        //brute force
        // ArrayList<Integer> list=new ArrayList<>();
        // ListNode current=head;
        // while(current!=null){
        //     list.add(current.val);
        //     current=current.next;
        // }
        // ListNode current1=head;
        // int i=0;
        // Collections.sort(list);

        // while(current1!=null && i<list.size()){
        //     current1.val=list.get(i);
        //     current1=current1.next;
        //     i++;
        // }
        // return head;
        if(head==null || head.next==null){
            return head;
        }

        ListNode mid=middle(head);
        ListNode leftHead=head;
        ListNode rightHead=mid.next;
        mid.next=null;
        
        leftHead=sortList(leftHead);
        rightHead=sortList(rightHead);

        return merge(leftHead,rightHead);
    }

    public ListNode merge(ListNode leftHead, ListNode rightHead){
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(leftHead!=null && rightHead!=null){
            if(leftHead.val<rightHead.val){
                temp.next=leftHead;
                temp=leftHead;
                leftHead=leftHead.next;
            }else{
                temp.next=rightHead;
                temp=rightHead;
                rightHead=rightHead.next;
            }
        }
        if(leftHead!=null){
            temp.next=leftHead;
        }
        if(rightHead!=null){
            temp.next=rightHead;
        }
        return dummy.next;
    }

    public ListNode middle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
}