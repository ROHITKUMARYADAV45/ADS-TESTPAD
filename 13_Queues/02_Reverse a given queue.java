static void reverseQueue(QueueArray q){
  java.util.Stack<Integer> st = new java.util.Stack<>();
  // Move queue elements to stack
  while(QueueArray.front <= QueueArray.rear)
  {
    st.push(q.dequeue());
  }
  // Reset queue
  QueueArray.front = -1;
  QueueArray.rear = -1;
  // Move back to queue in reverse order
  while(!st.isEmpty())
  {
    q.enqueue(st.pop());
  }
}