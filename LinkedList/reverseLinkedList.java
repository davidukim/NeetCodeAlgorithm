package LinkedList;

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
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode nextCurrent = null;    // temeporary(?) variable to save address to next node
        ListNode previous = null;
    
        while (current != null){        // Loop until Node is null
            nextCurrent = current.next; // next node to reverse
            current.next = previous;    // current.next points to previous(reverse)
            previous = current;         // previous points to current
            current = nextCurrent;      // update to next node as current
        }
        return previous;
    }
}