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
            tail.next = newn;
            newn.prev = tail;
            tail = newn;
        }
        tail.next = head;
        head.prev = tail;
        iCount++;
    }
    
    public void DeleteFirst()
    {
        if((head == null) && (tail == null))
        {
            return;
        }
        
        else if(head == tail)
        {
            head = null;
            tail = null;
            System.gc();
        }
        
        else
        {
            head = head.next;
            tail.next = head;
            head.prev = tail;
            System.gc();
            iCount--;
        }
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
        if((head == null) && (tail == null))
        {
            System.out.println("Linklist is Empty ");
            return;
        }
        
        node temp = head;
        System.out.println("Elements of Linklist Are : ");
        
        do
        {
            System.out.print("|"+temp.data+"<=>|");
            temp = temp.next;
        }while(temp != head);
        System.out.println("HEAD");
    }
    
    public int Count()
    {
        return iCount;
    }
}

class Program347
{
    public static void main(String A[])
    {
        DoublyCL dobj = new DoublyCL();
        int iRet = 0;
        
        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);
        
        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(121);
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
        dobj.DeleteFirst();
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);     
        
    }
}