/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        HashMap<ListNode,Integer> map= new HashMap<>();

        int index=1;
        while(head!=null){
            if(map.containsKey(head)){
                return true;
            }
            map.put(head,index);
            head=head.next;
            index++;
        }
        return false;
    }
}