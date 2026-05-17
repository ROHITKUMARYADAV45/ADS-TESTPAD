static int kSmallest(Node root, int k) {
    if (root == null || k <= 0)
        return 0;
    java.util.Stack<Node> st = new java.util.Stack<>();
    Node curr = root;
    while (curr != null || !st.isEmpty()) {
        while (curr != null) {
            st.push(curr);
            curr = curr.left;
        }
        curr = st.pop();
        k--;
        if (k == 0)
            return curr.data;
        curr = curr.right;
    }
    return 0;
}