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
        ArrayList<Integer> list=new ArrayList<>();
        ListNode current=head;
        while(current!=null){
            list.add(current.val);
            current=current.next;
        }
        ListNode current1=head;
        int i=0;
        Collections.sort(list);

        while(current1!=null && i<list.size()){
            current1.val=list.get(i);
            current1=current1.next;
            i++;
        }
        return head;
    }
}