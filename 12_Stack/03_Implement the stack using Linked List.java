class LinkStack
{
  private LinkList first; // ref to first item on list
  public LinkStack() // constructor
  {
    first = null;
  }
  public boolean isEmpty()
  {
    return (first == null);
  }
  public void push(int dd)
  {
    LinkList newNode = new LinkList(dd);
    newNode.next = first;
    first = newNode;
  }
  public int pop()
  {
    if(isEmpty())
      return -1;
    int val = first.data;
    first = first.next;
    return val;
  }
}