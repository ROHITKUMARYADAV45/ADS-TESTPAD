class Result {
    // Return the head of sum list
    static Node addListNumbers(Node head1, Node head2) {
        Node dummy = new Node(0);
        Node temp = dummy;
        int carry = 0;
        // Traverse both lists
        while (head1 != null || head2 != null || carry != 0) {
            int sum = carry;
            if (head1 != null) {
                sum += head1.data;
                head1 = head1.next;
            }
            if (head2 != null) {
                sum += head2.data;
                head2 = head2.next;
            }
            carry = sum / 10;
            temp.next = new Node(sum % 10);
            temp = temp.next;
        }
        return dummy.next;
    }
}