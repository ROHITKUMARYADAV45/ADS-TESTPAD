class Result {
    static boolean checkBST(Node root, long min, long max) {
        if (root == null) {
            return true;
        }
        // Current node must be within range
        if (root.data <= min || root.data >= max) {
            return false;
        }
        // Check left and right subtree
        return checkBST(root.left, min, root.data) &&
               checkBST(root.right, root.data, max);
    }
    static int isBinarySearchTree(Node root) {
        if (checkBST(root, Long.MIN_VALUE, Long.MAX_VALUE)) {
            return 1;
        }
        return 0;
    }
}