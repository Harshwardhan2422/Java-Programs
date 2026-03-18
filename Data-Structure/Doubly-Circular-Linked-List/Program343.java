class node
{
    public int data;
    public node next;
    public node prev;
    
    public node()
    {
        data = 0;
        next = null;
        prev = null;
    }
}

class DoublyCL 
{
    public node head;
    public node tail;
    public int iCount;
    
    public DoublyCL()
    {
        head = null;
        tail = null;
        iCount = 0;
    }
    
    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new node();
        newn.data = no;
              
        if((head == null) && (tail == null))
        {
            head = newn;
            tail = newn;
        }
        
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
        tail.next = head;
        head.prev = tail;
        iCount++;
    }
    
    public void InsertLast(int no)
    {
        
    }
    
    public void DeleteFirst()
    {
        
    }
    
    public void DeleteLast()
    {
        
    }
    
    public void InsertAtPos(int no, int ipos)
    {
        
    }
    
    public void DeleteAtPos(int ipos)
    {
        
    }
    
    public void Display()
    {
        
    }
    
    public int Count()
    {
        return 0;
    }
}

class Program343
{
    public static void main(String A[])
    {
        DoublyCL dobj = new DoublyCL();
        
        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);
        
    }
}