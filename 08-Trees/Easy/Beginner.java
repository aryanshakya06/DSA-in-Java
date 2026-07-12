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
    
    // Approach 1 - O(n^2)
    // public static int diameter(Node root) {
    //   if (root == null) {
    //     return 0;
    //   }
      
    //   int leftDiameter = diameter(root.left);
    //   int rightDiameter = diameter(root.right);
      
    //   int leftHeight = height(root.left);
    //   int rightHeight = height(root.right);
      
    //   int selfDiameter = leftHeight + rightHeight + 1;
      
    //   return Math.max( Math.max(leftDiameter, rightDiameter), selfDiameter);
    // }
    
    // Approach 2 - O(n)
    static class Info {
      int diameter;
      int height;
      
      Info (int diameter, int height) {
        this.diameter = diameter;
        this.height = height;
      }
    }
    
    public static Info diameter(Node root) {
      if (root == null) {
        return new Info(0 , 0);
      }
      
      Info leftInfo = diameter(root.left);
      Info rightInfo = diameter(root.right);
      
      int diameter = Math.max( Math.max(leftInfo.diameter, rightInfo.diameter), rightInfo.height + leftInfo.height + 1);
      int height = Math.max(leftInfo.height, rightInfo.height) + 1;
      
      return new Info(diameter, height);
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
        System.out.println(diameter(root).diameter);
    }
}