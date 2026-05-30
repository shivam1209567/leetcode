/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        // while(temp1 != null){
            
        //     while(temp2 != null){
        //         if(temp1 == temp2){
        //             return temp1;
        //         }
        //       temp2 = temp2.next;
        //     }
        //     temp2 = headB;
        //     temp1 = temp1.next;
        // }
        // return null;
        int sizeA = 0;
        while(temp1 != null){
            sizeA++;
            temp1 = temp1.next;
        }
        int sizeB = 0;
        while(temp2 != null){
            sizeB++;
            temp2 = temp2.next;
        }
        
        temp1 = headA;
        temp2 = headB;
        if(sizeA > sizeB){
            int diff = sizeA - sizeB;
            for(int i = 1; i <= diff; i++){
                temp1 = temp1.next;
            }
        }else{
            int diff = sizeB - sizeA;
            
            for(int i = 1; i <= diff; i++){
                temp2 = temp2.next;
            }
        }
        while(temp1 != temp2){
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        return temp1;

    }
}