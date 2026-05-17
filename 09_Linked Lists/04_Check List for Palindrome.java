class Result {
    static int checkPalindrome(Node head) {
        // Empty list
        if (head == null) {
            return 0;
        }
        // Single node
        if (head.next == null) {
            return 1;
        }
        // Find middle
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse second half
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        // Compare both halves
        Node first = head;
        Node second = prev;
        while (second != null) {
            if (first.data != second.data) {
                return 0;
            }
            first = first.next;
            second = second.next;
        }
        return 1;
    }
}