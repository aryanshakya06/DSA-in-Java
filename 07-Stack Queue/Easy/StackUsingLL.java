// Implementation of Stack using Linked List
// Time Complexity: push O(1), pop O(1), peek O(1)
// Space Complexity: O(n)

public class StackUsingLL {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class LinkedList {
        Node head;
        Node tail;
        int size;

        LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void addFirst(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                newNode.next = head;
                head = newNode;
            }

            size++;
        }

        public int removeFirst() {
            int data;

            if (head == null) {
                return -1;
            } else if (head.next == null) {
                data = head.data;
                head = null;
                tail = null;
                size--;
                return data;
            } else {
                data = head.data;
                head = head.next;
                size--;
                return data;
            }
        }

        public int getFirst() {
            if (head == null) {
                return -1;
            } else {
                return head.data;
            }
        }
    }

    public static class Stack {
        LinkedList list = new LinkedList();

        public void push(int data) {
            list.addFirst(data);
        }

        public int peek() {
            if (list.head == null) {
                return -1;
            } else {
                return list.head.data;
            }
        }

        public int pop() {
            if (list.head == null) {
                return -1;
            } else {
                int data = list.head.data;
                list.removeFirst();
                return data;
            }
        }

        public boolean isEmpty() {
            return list.size == 0;
        }
    }

    public static void main(String[] args) {

        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}