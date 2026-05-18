static Node shiftSmallLarge(Node head) {
    if (head == null || head.next == null) return head;
    
    // Find min and max values
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    Node curr = head;
    while (curr != null) {
        if (curr.data < min) min = curr.data;
        if (curr.data > max) max = curr.data;
        curr = curr.next;
    }
    
    Node minNode = null, maxNode = null;
    Node newHead = head, tail = head;
    
    // Build a new list excluding min and max nodes
    Node dummy = new Node(0);  // <-- fix: pass 0
    Node ptr = dummy;
    
    curr = head;
    while (curr != null) {
        if (curr.data == min && minNode == null) {
            minNode = curr;
        } else if (curr.data == max && maxNode == null) {
            maxNode = curr;
        } else {
            ptr.next = curr;
            ptr = ptr.next;
        }
        curr = curr.next;
    }
    ptr.next = null;
    
    // Attach max at end
    ptr.next = maxNode;
    maxNode.next = null;
    
    // Attach min at front
    minNode.next = dummy.next;
    
    return minNode;
}