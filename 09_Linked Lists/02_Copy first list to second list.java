static Node copyList(Node head) {
    // If list is empty
    if (head == null) {
        return null;
    }
    // Create new head node
    Node newHead = new Node(head.data);
    Node currOld = head.next;
    Node currNew = newHead;
    // Copy remaining nodes
    while (currOld != null) {
        currNew.next = new Node(currOld.data);
        currNew = currNew.next;
        currOld = currOld.next;
    }
    return newHead;
}