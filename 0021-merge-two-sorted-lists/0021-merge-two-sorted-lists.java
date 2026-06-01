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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        while(temp1 != null && temp2 != null){
            if(temp1.val < temp2.val){
                ListNode a = new ListNode(temp1.val);
                curr.next = a;
                curr = a;
                temp1 = temp1.next;
            }else{
                ListNode a = new ListNode(temp2.val);
                curr.next = a;
                curr = a;
                temp2 = temp2.next;
            }
        }
        if(temp1 == null){
           curr.next = temp2;
        }else{
            curr.next = temp1;
        }
        return dummy.next;
    }
}