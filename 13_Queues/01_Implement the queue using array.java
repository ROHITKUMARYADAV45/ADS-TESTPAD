import java.util.*;
class QueueArray
{
  static int SIZE=100;
  static int front=-1;
  static int rear=-1;
  static int array[]=new int[SIZE];
  QueueArray()
  {
    front=rear=-1;
  }
  // Method to add an item to the queue.
  void enqueue(int item)
  {
    if(front == -1)
      front = 0;
    rear++;
    array[rear] = item;
  }
  // Method to remove an item from queue.
  int dequeue()
  {
    if(front == -1 || front > rear)
      return -1;
    int val = array[front];
    front++;
    if(front > rear)
      front = rear = -1;
    return val;
  }
}