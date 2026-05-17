// Return the head of updated list after swapping the two nodes
Node swapNodes(Node head, int x, int y) {
    // If both keys are same
    if (x == y) {
        return head;
    }
    Node nodeX = head;
    Node nodeY = head;
    // Find nodeX
    while (nodeX != null && nodeX.data != x) {
        nodeX = nodeX.next;
    }
    // Find nodeY
    while (nodeY != null && nodeY.data != y) {
        nodeY = nodeY.next;
    }
    // If any node not found
    if (nodeX == null || nodeY == null) {
        return head;
    }
    // Swap data values
    int temp = nodeX.data;
    nodeX.data = nodeY.data;
    nodeY.data = temp;
    return head;
}