/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
      Node temp1 = head;
      Node head2 = new Node(-1);
      Node temp2 = head2;
      while(temp1 != null){
        Node a = new Node(temp1.val);
        temp2.next = a;
        temp2 = a;
        temp1 = temp1.next;
      }  
     head2 = head2.next;
     temp2 = head2;
     temp1 = head;
     Node head3 = new Node(-1);
     Node temp3 = head3;
     
     while(temp1 != null && temp2 != null){
         temp3.next = temp1;
         
         temp1 = temp1.next;
         temp3 = temp3.next;

         temp3.next = temp2;
        
         temp2 = temp2.next;
         temp3 = temp3.next;
     }
     head3 = head3.next;
     temp3 = head3;
     temp1 = head;
     temp2 = head2;
     while(temp1 != null){
        if(temp1.random == null){
            temp2.random = null;
        }else{
        temp2.random = temp1.random.next;
        }
        temp1 = temp1.next.next;
        if(temp1 != null) temp2 = temp2.next.next;
     }
     temp2 = head2;
     temp1 = head;
     while(temp1 != null){
        temp1.next = temp1.next.next;
        temp1 = temp1.next;
        if(temp1 == null) break;
        temp2.next = temp2.next.next;
        if(temp2.next == null) break;
        temp2 = temp2.next;
     }
     return head2;
    }
}