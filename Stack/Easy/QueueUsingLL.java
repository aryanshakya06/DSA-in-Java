// Implementation of Queue using Linked List
// Time Complexity: enqueue O(1), dequeue O(1), getFront O(1), getRear O(1)
// Space Complexity: O(n)

public class QueueUsingLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static class LinkedList {

        Node head;
        Node tail;
        int size;

        LinkedList() {
            this.head = null;
            this.tail = null;
            this.size = 0;
        }

        public void addLast(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = tail = newNode;
                size++;
                return;
            }

            tail.next = newNode;
            tail = newNode;
            size++;
        }

        public int removeFirst() {
            if (head == null)
                return -1;

            int value = head.data;
            head = head.next;
            size--;

            if (head == null) {
                tail = null;
            }

            return value;
        }

        public int getFirst() {
            return head == null ? -1 : head.data;
        }

        public int getLast() {
            return tail == null ? -1 : tail.data;
        }
    }

    static class Queue {
        LinkedList list = new LinkedList();

        public void enqueue(int data) {
            list.addLast(data);
        }

        public int dequeue() {
            return list.removeFirst();
        }

        public int getFront() {
            return list.getFirst();
        }

        public int getRear() {
            return list.getLast();
        }

        public boolean isEmpty() {
            return list.size == 0;
        }

        public int size() {
            return list.size;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.getFront());
        System.out.println(q.getRear());
    }
}