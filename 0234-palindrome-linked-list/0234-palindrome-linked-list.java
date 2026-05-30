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
    ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode prevNode = null;
        ListNode currNode = head;
        while(currNode != null){
            ListNode nextNode = currNode.next;
            currNode.next = prevNode;

            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
    ListNode middleNode(ListNode head){
        ListNode ka = head;
        ListNode kh = head;
        while(kh.next != null && kh.next.next != null){
            ka = ka.next;
            kh = kh.next.next;
        }
        return ka;
    }
    public boolean isPalindrome(ListNode head) {
       ListNode middleNode = middleNode(head);
       ListNode reverseNode = reverse(middleNode.next);
       ListNode firstHalfNode = head;
       while(reverseNode != null){
        if(firstHalfNode.val != reverseNode.val){
            return false;
        }
        firstHalfNode = firstHalfNode.next;
        reverseNode = reverseNode.next;

       }
       return true;
    }
}