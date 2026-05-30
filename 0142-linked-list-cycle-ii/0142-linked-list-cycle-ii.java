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
    public ListNode detectCycle(ListNode head) {
        ListNode ka = head;
        ListNode kh = head;
        while(kh != null && kh.next != null){
           
            ka = ka.next;
            kh = kh.next.next;
             if(kh == ka){
                break;
            }
        }
        if(kh == null || kh.next == null) return null;
        ListNode temp = head;
        while(temp != ka){
            temp = temp.next;
            ka = ka.next;

        }
        return temp;
    }
}