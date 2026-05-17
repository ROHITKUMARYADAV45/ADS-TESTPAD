static void forwardPrint(Node head) {
    // Base case
    if (head == null) {
        return;
    }
    System.out.print(head.data + "-");
    forwardPrint(head.next);
}
static void backwardPrint(Node head) {
    // Base case
    if (head == null) {
        return;
    }
    backwardPrint(head.next);
    System.out.print(head.data + "-");
}