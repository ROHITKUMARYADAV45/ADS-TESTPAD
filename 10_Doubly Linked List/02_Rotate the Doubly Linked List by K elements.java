static LinkList rotateByK(LinkList head, int k)
{
    // Empty list, single node, or no rotation
    if(head == null || head.next == null || k == 0)
        return head;
    int len = 1;
    LinkList tail = head;
    // Find length and tail
    while(tail.next != null)
    {
        tail = tail.next;
        len++;
    }
    // Handle k greater than length
    k = k % len;
    if(k == 0)
        return head;
    // Right rotation by k
    int steps = len - k;
    LinkList curr = head;
    // Move to node before new head
    for(int i = 1; i < steps; i++)
    {
        curr = curr.next;
    }
    LinkList newHead = curr.next;
    // Break the list
    curr.next = null;
    newHead.prev = null;
    // Connect old tail to old head
    tail.next = head;
    head.prev = tail;
    return newHead;
}