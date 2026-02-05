// Problem: Reverse a singly linked list so that the nodes appear in the opposite order, and return the new head
// LeetCode 206
public class ReverseList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;

        }

        // Recursion
        // Time Complexity: O(n)
        // Space Complexity: O(n)
        public ListNode reverseList(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }

            ListNode newHead = reverseList(head.next);
            ListNode front = head.next;
            front.next = head;
            head.next = null;

            return newHead;
        }

        // Iteration
        // Time Complexity: O(n)
        // Space Complexity: O(1)
        // public ListNode reverseList(ListNode head) {
        //     ListNode curr = head;
        //     ListNode prev = null;
        //     ListNode next;

        //     while (curr != null) {
        //         next = curr.next;
        //         curr.next = prev;
        //         prev = curr;
        //         curr = next;
        //     }

        //     return prev;
        // }
    }
}
