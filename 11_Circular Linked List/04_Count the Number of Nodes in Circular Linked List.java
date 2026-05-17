class Result {
  static int countNodes(Node head) {
    // Empty list
    if(head == null)
      return 0;
    int count = 1;
    Node temp = head.next;
    // Traverse till head again
    while(temp != head)
    {
      count++;
      temp = temp.next;
    }
    return count;
  }
}