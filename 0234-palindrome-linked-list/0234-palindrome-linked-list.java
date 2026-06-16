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
    ListNode left;
    public boolean isPalindrome(ListNode head) {
        left=head;
        return checker(head);
    }
    public boolean checker(ListNode right){
        if(right==null){
            return true;
        }
        boolean result=checker(right.next);
        if(right.val!=left.val){
            return false;
        }
        left=left.next;
        return result;
    }
}