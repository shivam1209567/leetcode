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
        ListNode newNode = new ListNode(-1);
        ListNode temp = newNode;
        while(list1 != null && list2 != null){
            if(list1.val < list2.val){
                ListNode n1 = new ListNode(list1.val);
                temp.next = n1;
                temp = n1;
                list1 = list1.next;
            }else{
                ListNode n2 = new ListNode(list2.val);
                temp.next = n2;
                temp = n2;
                list2 = list2.next;
            }
        }
        if(list2 == null){
            temp.next = list1;
        }else{
            temp.next = list2;
        }
        return newNode.next;
    }
}