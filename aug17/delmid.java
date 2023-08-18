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
        if(head==null || head.next == null)
             return null;
        ListNode one = head;
        ListNode two = head.next.next;
        while(two!=null && two.next!=null) {
            one = one.next;
            two = two.next.next;
        }
        one.next = one.next.next;
        return head;
        
    }
}