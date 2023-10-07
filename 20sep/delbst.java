class Tree {
    // Function to delete a node from BST.
    public static Node deleteNode(Node root, int X) {
        // code here.
        if (root == null)
            return root;
        if (root.X > X) {
            root.left = deleteNode(root.left, X);
            return root;
        } else if (root.X < X) {
            root.right = deleteNode(root.right, X);
            return root;
        }
        if (root.left == null) {
            Node temp = root.right;
            return temp;
        } else if (root.right == null) {
            Node temp = root.left;
            return temp;
        }
        else {
 
            Node succParent = root;
            Node succ = root.right;
            while (succ.left != null) {
                succParent = succ;
                succ = succ.left;
            }
            if (succParent != root)
                succParent.left = succ.right;
            else
                succParent.right = succ.right;
            root.X = succ.X;
            return root;
        }
    }
}