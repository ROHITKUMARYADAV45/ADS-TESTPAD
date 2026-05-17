class Result {
  static LinkList insertSorted(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    // Empty list
    if(head == null)
    {
      newNode.next = newNode;
      return newNode;
    }
    LinkList curr = head;
    // Insert before head (smallest element)
    if(data <= head.data)
    {
      while(curr.next != head)
      {
        curr = curr.next;
      }
      curr.next = newNode;
      newNode.next = head;
      return newNode;
    }
    // Find correct position
    while(curr.next != head && curr.next.data < data)
    {
      curr = curr.next;
    }
    newNode.next = curr.next;
    curr.next = newNode;
    return head;
  }
}