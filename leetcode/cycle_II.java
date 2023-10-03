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
       if(head == null || head.next == null){
           return null;
       }
       ListNode slow = head;
       ListNode fast = head;

       while(fast!= null && slow != null && fast.next != null){
           slow = slow.next;
           fast = fast.next.next;

           if(fast == slow) break;

       }
       ListNode temp = head;
       while(temp != slow ){
           temp = temp.next;
            if(slow == null) break;
           slow = slow.next;
       }return slow;
   }
} {
    
}
