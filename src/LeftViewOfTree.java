class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class LeftViewOfTree {
    Node root;
    static int max_level = 0;

    //function to print left view
    void leftViewUtil(Node node, int level) {
        //Base Case
        if (node == null)
            return;

        //this node is the first node of its level
        if (max_level < level) {
            System.out.print(" " + node.data);
            max_level = level;
        }

        //Recur for left and right subtree
        leftViewUtil(node.left, level + 1);
        leftViewUtil(node.right, level + 1);

    }
    //A wrapper over leftViewUtil
    void leftView() {
        max_level = 0;
        leftViewUtil(root, 1);
    }

    public static void main(String[] args) {
        LeftViewOfTree tree = new LeftViewOfTree();
        tree.root = new Node(10);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.leftView();
    }
}
