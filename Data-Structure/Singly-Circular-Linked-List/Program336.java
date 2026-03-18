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
        }
        else
        {
            newn.next = head;
            head = newn;   
        }        
        tail.next = head;
        iCount++;
    }
    
    public void InsertLast(int no)
    {
        node newn = null;
        newn = new node();
        newn.data = no;
        newn.next = null;
        
        if((head == null) && (tail == null))
        {
            head = newn;
            tail = newn;
        }
        else
        {
            tail.next = newn;
            tail = newn;
        }
        tail.next = head;
        iCount++;
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
        node temp = null;
        temp = head;
        
        System.out.println("Elements of Linklist Are : ");
        
        do
        {
            System.out.print("|"+temp.data+"| ");
            temp = temp.next;
        }while(temp != tail.next);
        System.out.println();
    }
    
    public int Count()
    {
        return iCount;
    }       
}

class Program336
{
    public static void main(String A[])
    {
        SinglyCL sobj = new SinglyCL();
        int iRet = 0;
        
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        
        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(151);
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
    }
}