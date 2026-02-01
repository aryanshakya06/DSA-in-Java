public class ReorderList {

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

        public static void reorderList(ListNode head) {
            ListNode slow = head;
            ListNode fast = head.next;

            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            ListNode curr = slow.next;
            slow.next = null;

            ListNode prev = null;
            ListNode next;

            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode left = head;
            ListNode right = prev;
            ListNode nextL;
            ListNode nextR;

            while (left != null && right != null) {
                nextL = left.next;
                left.next = right;
                nextR = right.next;
                right.next = nextL;

                left = nextL;
                right = nextR;
            }
        }

        public static void print(ListNode head) {
            ListNode temp = head; 
            while (temp != null) {
                System.out.print(temp.val + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
    }
}

// /**
//  * Definition for singly-linked list.
//  * public class ListNode {
//  *     int val;
//  *     ListNode next;
//  *     ListNode() {}
//  *     ListNode(int val) { this.val = val; }
//  *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
//  * }
//  */
// class Solution {
//     public void reorderList(ListNode head) {
//         if(head == null || head.next == null){
//             return;
//         }

//         ListNode fast = head, slow = head;
//         while(fast != null && fast.next != null){
//             fast = fast.next.next;
//             slow = slow.next;
//         }

//         ListNode secondHalf = reverseList(slow.next);
//         slow.next = null;
//         ListNode firstHalf = head;

//         while(secondHalf != null){
//             ListNode firstHalfNext = firstHalf.next;
//             ListNode secondHalfNext = secondHalf.next;

//             firstHalf.next = secondHalf;
//             firstHalf = firstHalfNext;
//             secondHalf.next = firstHalf;
//             secondHalf = secondHalfNext;
//         }
//     }

//     private ListNode reverseList(ListNode head){
//         ListNode curr = head;
//         ListNode prev = null;
//         while(curr != null){
//             ListNode next = curr.next;
//             curr.next = prev;
//             prev = curr;
//             curr = next;
//         }
//         return prev;
//     }
// }