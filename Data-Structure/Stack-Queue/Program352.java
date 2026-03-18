class node
{
    public int data;
    public node next;
    
    public node()
    {
        data = 0;
        next = null;
    }
}

class Stack
{
    public node head;
    public int iCount;
    
    public Stack()
    {
        head = null;
        iCount = 0;
    }
    
    public void Push(int no)
    {
        node newn = null;
        newn = new node();
        newn.data = no;
        
        if(head == null)
        {
            head = newn;
        }
        
        else
        {
            newn.next = head;
            head = newn;
        }
        iCount++;
    }
    
    public int Pop()
    {
        return 0;
    }
    
    public void Display()
    {
        
    }
    
    public int Count()
    {
        return 0;
    }
}

class Program352
{
    public static void main(String A[])
    {
        Stack sobj = new Stack();
        
        sobj.Push(101);
        sobj.Push(51);
        sobj.Push(21);
        sobj.Push(11);
    }
}