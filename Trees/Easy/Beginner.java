public class Beginner {
    
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);
        int height = Math.max(lh, rh) + 1;

        return height;
    }

    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int lc = countNodes(root.left);
        int rc = countNodes(root.right);
        int count = lc + rc + 1;

        return count;
    }

    public static int sumNodes(Node root) {
        if (root == null) {
            return 0;
        }

        int ls = sumNodes(root.left);
        int rs = sumNodes(root.right);
        int sum = ls + rs + root.data;

        return sum;
    }

    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        System.out.println(height(root));
        System.out.println(countNodes(root));
        System.out.println(sumNodes(root));
    }
}