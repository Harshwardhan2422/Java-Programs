class node
{
    public int data;
    public node next;
    public node prev;
    
    public node(int  x)
    {
        data = x;
        next = null;
        prev = null;
    }    
}

class DoublyLL 
{
    public node head;
    
    public DoublyLL()
    {
        head = null;
    }
    
    public void InsertFirst(int no)
    {
        node newn = null;
        newn = new node(no);
        
        if(head == null)
        {
            head = newn;
        }
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
    }    
    
    public void InsertLast(int no)
    {
        node newn = null;
        node temp = null;
        newn = new node(no);
        
        if(head == null)
        {
            head = newn;
        }
        else
        {
            temp = head;
            
            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
            newn.prev = temp;                       
        }
    }
    
    public void Display()
    {
        node temp = null;
        temp = head;
        
        System.out.print("null");
        while(temp != null)
        {
            System.out.print("<=>|"+temp.data+"|");
            temp = temp.next;
        }
        System.out.println("null");
    }
    
    public int Count()
    {
        int iCount = 0;
        node temp = null;
        temp = head;
        
        while(temp != null)
        {
            iCount++;
            temp = temp.next;
        }
        return iCount;
    }
    
    public void DeleteFirst()
    {
        node temp = null;
        
        if(head == null)
        {
            return;
        }
        else if(head.next == null)
        {
            head = null;
            System.gc();
        }
        else
        {
            temp = head;          
            head = head.next;
            head.prev = null;
            System.gc();            
        }
    }
    
    public void DeleteLast()
    {
        
    }
}

class Program326
{
    public static void main(String A[])
    {
        DoublyLL dobj = new DoublyLL();
        int iRet = 0;
        
        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);
        
        dobj.InsertLast(101);
        dobj.InsertLast(111);
        dobj.InsertLast(151);
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
        dobj.DeleteFirst();
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
                       
    }
}
