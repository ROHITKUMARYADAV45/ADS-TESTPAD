// Return the head of updated list
struct Node* shiftSmallLarge(struct Node *head) {
    if(head == NULL || head->next == NULL)
        return head;
    struct Node *curr = head, *prev = NULL;
    struct Node *minNode = head, *maxNode = head;
    struct Node *minPrev = NULL, *maxPrev = NULL;
    // Find min and max nodes
    while(curr != NULL)
    {
        if(curr->data < minNode->data)
        {
            minNode = curr;
            minPrev = prev;
        }
        if(curr->data > maxNode->data)
        {
            maxNode = curr;
            maxPrev = prev;
        }
        prev = curr;
        curr = curr->next;
    }
    // If min and max are same
    if(minNode == maxNode)
        return head;
    // -------- Move minimum to head --------
    if(minNode != head)
    {
        minPrev->next = minNode->next;
        minNode->next = head;
        head = minNode;
    }
    // Recalculate maxPrev if maxNode was before minNode
    prev = NULL;
    curr = head;
    while(curr != NULL && curr != maxNode)
    {
        prev = curr;
        curr = curr->next;
    }
    maxPrev = prev;
    // -------- Move maximum to tail --------
    if(maxNode->next != NULL)
    {
        maxPrev->next = maxNode->next;
        struct Node *temp = head;
        while(temp->next != NULL)
            temp = temp->next;
        temp->next = maxNode;
        maxNode->next = NULL;
    }
    return head;
}