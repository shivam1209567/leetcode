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
    public void reorderList(ListNode head) {
        int size = 0;
        ListNode temp = head;
        ListNode dummy = new ListNode(-1);
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
       for(int i = 0; i < size/2; i++){
         temp = temp.next;
         }
       ListNode prev = null;
       ListNode curr = temp.next;
       temp.next = null;
        
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        ListNode temp1 = head;
        ListNode temp2 = prev;
        while(temp2 != null){
            ListNode Temp1 = temp1.next;
            ListNode Temp2 = temp2.next;
            
                temp1.next = temp2;
                temp2.next = Temp1;

                temp1 = Temp1;
                temp2 = Temp2;
            
            
        }
        
    }
}