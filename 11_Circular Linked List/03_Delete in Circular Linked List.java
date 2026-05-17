static LinkList deleteBeg(LinkList head){
  // Empty list
  if(head == null)
    return null;
  // Single node
  if(head.next == head)
    return null;
  LinkList last = head;
  // Find last node
  while(last.next != head)
  {
    last = last.next;
  }
  // Change last next to new head
  last.next = head.next;
  head = head.next;
  return head;
}
static LinkList deleteEnd(LinkList head){
  // Empty list
  if(head == null)
    return null;
  // Single node
  if(head.next == head)
    return null;
  LinkList prev = null;
  LinkList curr = head;
  // Reach last node
  while(curr.next != head)
  {
    prev = curr;
    curr = curr.next;
  }
  // Remove last node
  prev.next = head;
  return head;
}