static void reverseKelementsQueue(QueueArray q, int K)
{
  java.util.Stack<Integer> st = new java.util.Stack<>();
  // Total elements in queue
  int size = q.rear - q.front + 1;
  // Push first K elements into stack
  for(int i = 0; i < K; i++)
  {
    st.push(q.dequeue());
  }
  // Enqueue reversed elements
  while(!st.isEmpty())
  {
    q.enqueue(st.pop());
  }
  // Move remaining elements to back
  int remaining = size - K;
  for(int i = 0; i < remaining; i++)
  {
    q.enqueue(q.dequeue());
  }
}