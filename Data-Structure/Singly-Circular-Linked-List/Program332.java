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

class SinglyCL 
{
    public node head;
    public node tail;
    int iCount;
    
    public SinglyCL()
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
        newn.next = null;
        
        if((head == null) && (tail == null))
        {
            head = newn;
            tail = newn;
            tail.next = newn;
        }
        else
        {
            newn.next = head;
            head = newn;
            tail.next = head;
        }        
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

class Program332
{
    public static void main(String A[])
    {
        SinglyCL sobj = new SinglyCL();
    }
}