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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head.next == null)  
             return head;

        ListNode temp = new ListNode(0);
        temp.next= head;
        ListNode prev = temp;

        for(int i = 1; i <= left - 1; i++ )  
           prev = prev.next;
        
        ListNode current = prev.next;
        

        for(int i = 1; i <= right - left; i++)
        {
            ListNode front = current.next;
            current.next = front.next;
            front.next = prev.next;
            prev.next = front;
        } 
        return temp.next;
        
    }
}