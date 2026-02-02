// Problem: Return the middle node of a linked list (return the second middle if the list has even length)
// LeetCode 876
public class MiddleNode {
    public static class ListNode {
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
    }

    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // public ListNode middleNode(ListNode head) {
    // ListNode temp = head;
    // int count = 0;

    // while (temp != null) {
    // count++;
    // temp = temp.next;
    // }

    // int mid = count / 2 + 1;
    // count = 1;
    // temp = head;

    // while (count < mid) {
    // temp = temp.next;
    // count++;
    // }

    // return temp;
    // }
}