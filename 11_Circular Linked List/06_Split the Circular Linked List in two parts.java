class Result {
  static LinkList listCut(LinkList head) {
    if(head == null || head.next == head)
      return null;
    LinkList slow = head;
    LinkList fast = head;
    // Find middle
    while(fast.next != head && fast.next.next != head)
    {
      slow = slow.next;
      fast = fast.next.next;
    }
    // For even nodes move fast to last node
    if(fast.next.next == head)
    {
      fast = fast.next;
    }
    // Second half starts here
    LinkList head2 = slow.next;
    // Make first half circular
    slow.next = head;
    // Make second half circular
    fast.next = head2;
    return head2;
  }
}