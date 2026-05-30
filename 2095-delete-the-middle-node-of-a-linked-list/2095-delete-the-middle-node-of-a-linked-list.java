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
    public ListNode deleteMiddle(ListNode head) {
        ListNode prevNode = head;
        ListNode fastNode = head;
        ListNode slowNode = head;
        if(head == null || head.next == null){
            return null;
        }
        if(head.next.next == null){
            head.next = null;
            return head;
        }
        while(fastNode.next != null && fastNode.next.next != null){
            prevNode = slowNode;
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
            if(fastNode.next == null){
                prevNode.next = prevNode.next.next;
                return head;
            }
        }
        slowNode.next = slowNode.next.next;
        return head;
    }
}