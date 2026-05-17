class Result {
    static void deleteNode(Node n1) {
        // If node is null or last node
        if (n1 == null || n1.next == null) {
            return;
        }
        // Copy next node data
        n1.data = n1.next.data;
        // Delete next node
        n1.next = n1.next.next;
    }
}