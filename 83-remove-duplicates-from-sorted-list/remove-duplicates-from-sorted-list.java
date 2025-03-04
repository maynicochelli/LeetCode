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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode currentValue = head;
        while (currentValue != null && currentValue.next != null) {
            if (currentValue.val == currentValue.next.val) {
                currentValue.next = currentValue.next.next;
            } else {
                currentValue = currentValue.next;
            }
        }
        return head;
    }
}