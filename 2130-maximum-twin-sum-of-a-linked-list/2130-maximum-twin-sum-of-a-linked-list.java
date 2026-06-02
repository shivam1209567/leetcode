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
    public int pairSum(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while(temp != null){
            temp = temp.next;
            size++;
        }
        temp = head;
        for(int i = 0; i < size/2;  i++){
            temp = temp.next;
        }
        ListNode dummy = new ListNode(-1);
        ListNode prev = temp;
        
        ListNode curr = temp.next;
        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
       dummy.next = prev;
       temp.next = null;
       dummy = dummy.next;
       int sum = Integer.MIN_VALUE;
       while(head != null && dummy != null){
        sum = Math.max(sum,head.val + dummy.val);
        head = head.next;
        dummy = dummy.next;
       } 
       return sum;
    }
}