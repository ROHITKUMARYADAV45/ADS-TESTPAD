int minArray[] = new int[100];
int minTop = -1;
public void push(int j) // put item on top of stack
{
  if(isFull())
    return;
  stackArray[++top] = j;
  // Push in min stack
  if(minTop == -1 || j <= minArray[minTop])
  {
    minArray[++minTop] = j;
  }
}
public int pop() // take item from top of stack
{
  if(isEmpty())
    return -1;
  int val = stackArray[top--];
  // Remove from min stack too
  if(val == minArray[minTop])
  {
    minTop--;
  }
  return val;
}
public int getMin()
{
  if(isEmpty())
    return -1;
  return minArray[minTop];
}