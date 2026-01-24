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

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Empty LinkedList");
            return -1;
        }
        int data = head.data;

        if (head == tail) {
            head = tail = null;
        }

        size--;
        head = head.next;

        return data;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Empty LinkedList");
            return -1;
        }

        int data = tail.data;

        if (head == tail) {
            head = tail = null;
        }
        
        size--;
        Node previous = head;
        while ((previous.next).next != null) {
            previous = previous.next;
        }

        previous.next = null;
        return data;
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFirst(20);
        list.addFirst(10);
        list.addLast(40);
        list.addLast(50);
        list.add(2, 30);
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        list.print();
        System.out.println(list.size);
    }
}