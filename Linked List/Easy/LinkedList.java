public class LinkedList {

    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Time Complexity: O(n) -> traversal up to index
    // Space Complexity: O(1)
    public void add(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;
        while (i != index - 1) {
            if (temp == null) {
                break;
            }
            i++;
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Time Complexity: O(1)
    // Space Complexity: O(1)
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty LinkedList");
            return -1;
        }
        int data = head.data;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }

        size--;

        return data;
    }

    // Time Complexity: O(n) -> traversal to second last node
    // Space Complexity: O(1)
    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty LinkedList");
            return -1;
        }

        int data = tail.data;

        if (head == tail) {
            head = tail = null;
        } else {
            Node previous = head;
            while ((previous.next).next != null) {
                previous = previous.next;
            }

            previous.next = null;
            tail = previous;
        }

        size--;

        return data;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public int iterativeSearch(int key) {
        Node temp = head;
        int i = -1;

        while (temp != null) {
            i++;
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
        }

        return -1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n) -> call stack

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int index = helper(head.next, key);
        if (index == -1) {
            return -1;
        }

        return index + 1;
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Time Complexity: O(n)
    // Space Complexity: O(1)
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.add(2, 30);
        // System.out.println(list.removeFirst());
        // System.out.println(list.removeLast());
        list.print();
        System.out.println(list.size);

        list.reverse();
        list.print();
        // System.out.println(list.iterativeSearch(40));
        // System.out.println(list.iterativeSearch(100));

        // System.out.println(list.recursiveSearch(40));
        // System.out.println(list.recursiveSearch(100));
    }
}