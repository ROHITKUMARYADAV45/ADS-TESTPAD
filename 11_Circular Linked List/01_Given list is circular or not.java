static int isCircular(Node head) {
  // Empty list is circular
  if(head == null)
    return 1;
  Node slow = head;
  Node fast = head;
  // Detect cycle
  while(fast != null && fast.next != null)
  {
    slow = slow.next;
    fast = fast.next.next;
    if(slow == fast)
    {
      // Check if cycle includes head
      Node temp = slow;
      do
      {
        if(temp == head)
          return 1;
        temp = temp.next;
      } while(temp != slow);
      return 0;
    }
  }
  return 0;
}