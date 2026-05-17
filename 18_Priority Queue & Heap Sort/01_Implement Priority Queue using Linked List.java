/* class QueueNode
{
  int data;
  int priority;
  QueueNode next;
  public QueueNode(int data, int p)
  {
    this.data = data;
    this.priority = p;
  }
} */
class PQueueLL
{
    public QueueNode front, rear;
    // Insert according to priority
    public void EnQueue(int data, int priority)
    {
        QueueNode newNode = new QueueNode(data, priority);
        // If queue is empty
        if(front == null)
        {
            front = rear = newNode;
            return;
        }
        // Insert at beginning if higher priority
        if(priority < front.priority)
        {
            newNode.next = front;
            front = newNode;
            return;
        }
        QueueNode temp = front;
        // Find correct position
        while(temp.next != null &&
              temp.next.priority <= priority)
        {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
        // Update rear
        if(newNode.next == null)
        {
            rear = newNode;
        }
    }
    // Delete highest priority element
    public int DeQueue()
    {
        // Queue empty
        if(front == null)
        {
            return -1;
        }
        int value = front.data;
        front = front.next;
        // If queue becomes empty
        if(front == null)
        {
            rear = null;
        }
        return value;
    }
}