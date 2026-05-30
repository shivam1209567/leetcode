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
        ListNode ka = head;
        ListNode kh = head;
        if(head == null) return false;
        while(kh != null && kh.next != null){
            
            ka = ka.next;
            kh = kh.next.next;
             if(kh == ka){
                return true;
            }
        }
        return false;
        
    }
}