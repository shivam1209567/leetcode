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
        if(head.next == null){
            return null;
        }
       
        int size = 0;
        ListNode temp = head;
        while(temp != null){
          temp = temp.next;
          size++;
        }
        int s = size - n + 1;
        if(s == 1){
            return head.next;
        }
        ListNode t = head;
        for(int i = 0; i < s - 2; i++){
            t = t.next;
        }
        t.next = t.next.next;
        return head;
    }
    
}