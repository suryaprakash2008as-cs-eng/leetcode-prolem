/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Use a dummy node to simplify edge cases (e.g., removing the head node)
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        // 1. Move fast pointer so that the gap between fast and slow is n nodes
        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        // 2. Move both fast and slow until fast reaches the end
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }

        // 3. Skip the nth node from the end
        slow.next = slow.next.next;

        return dummy.next;
    }
}
