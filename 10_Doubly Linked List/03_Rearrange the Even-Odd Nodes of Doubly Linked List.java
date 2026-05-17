static Node rearrangeList(Node head) {
    // Empty list or single node
    if (head == null || head.next == null) {
        return head;
    }
    Node oddHead = null, oddTail = null;
    Node evenHead = null, evenTail = null;
    Node curr = head;
    int pos = 1;
    while (curr != null) {
        Node nextNode = curr.next;
        // Disconnect current node
        curr.next = null;
        curr.prev = null;
        // Even position
        if (pos % 2 == 0) {
            if (evenHead == null) {
                evenHead = evenTail = curr;
            } else {
                evenTail.next = curr;
                curr.prev = evenTail;
                evenTail = curr;
            }
        }
        // Odd position
        else {
            if (oddHead == null) {
                oddHead = oddTail = curr;
            } else {
                oddTail.next = curr;
                curr.prev = oddTail;
                oddTail = curr;
            }
        }
        curr = nextNode;
        pos++;
    }
    // Join even list with odd list
    if (evenTail != null) {
        evenTail.next = oddHead;
        if (oddHead != null) {
            oddHead.prev = evenTail;
        }
        return evenHead;
    }
    return oddHead;
}