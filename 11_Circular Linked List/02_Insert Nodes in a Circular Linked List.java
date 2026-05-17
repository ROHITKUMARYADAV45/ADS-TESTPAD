static LinkList insertBeg(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    // Empty list
    if(head == null)
    {
        newNode.next = newNode;
        return newNode;
    }
    LinkList temp = head;
    // Find last node
    while(temp.next != head)
    {
        temp = temp.next;
    }
    newNode.next = head;
    temp.next = newNode;
    return newNode; // new head
}
static LinkList insertEnd(LinkList head, int data) {
    LinkList newNode = new LinkList(data);
    // Empty list
    if(head == null)
    {
        newNode.next = newNode;
        return newNode;
    }
    LinkList temp = head;
    // Find last node
    while(temp.next != head)
    {
        temp = temp.next;
    }
    temp.next = newNode;
    newNode.next = head;
    return head;
}