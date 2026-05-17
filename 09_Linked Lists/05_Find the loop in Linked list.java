class Result {
    static int loopInList(Node head) {
        if (head == null) {
            return 0;
        }
        Node slow = head;
        Node fast = head;
        // Detect loop using Floyd Cycle Detection
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            // Loop found
            if (slow == fast) {
                int count = 1;
                fast = fast.next;
                // Count nodes in loop
                while (fast != slow) {
                    count++;
                    fast = fast.next;
                }
                return count;
            }
        }
        // No loop
        return 0;
    }
}