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
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
            iCount--;
        }
    }
    
    public void InsertAtPos(int no, int ipos)
    {
        int Countnode = 0, i = 0;
        node newn = null;
        node temp = null;
        
        Countnode = Count();
        
        if((ipos < 1) || (ipos > Countnode + 1))
        {
            System.out.println("Invalid Position");
            return;
        }
        
        if(ipos == 1)
        {
            InsertFirst(no);
        }
        
        else if(ipos == Countnode + 1)
        {
            InsertLast(no);
        }
        
        else
        {
            newn = new node();
            newn.data = no;
            temp = head;
            
            for(i = 1; i < ipos - 1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next.prev = newn;
            temp.next = newn;
            newn.prev = temp;
            iCount++;
        }       
    }
    
    public void DeleteAtPos(int ipos)
    {
         int Countnode = 0, i = 0;
        node target = null;
        node temp = null;
        
        Countnode = Count();
        
        if((ipos < 1) || (ipos > Countnode))
        {
            System.out.println("Invalid Position");
            return;
        }
        
        if(ipos == 1)
        {
            DeleteFirst();
        }
        
        else if(ipos == Countnode)
        {
            DeleteLast();
        }
        else
        {
            temp = head;
            
            for(i = 1; i < ipos - 1; i++)
            {
                temp = temp.next;
            }
            target = temp.next;
            temp.next = target.next;
            target.next.prev = temp;
            iCount--;
        }   
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
            System.out.print("|"+temp.data+"|<=>");
            temp = temp.next;
        }while(temp != head);
        System.out.println("HEAD");
    }
    
    public int Count()
    {
        return iCount;
    }
}

class Program350
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
              
        dobj.InsertAtPos(75,4);
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);      
        
        dobj.DeleteAtPos(4);
        
        dobj.Display();
        iRet = dobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);      
                     
    }
}