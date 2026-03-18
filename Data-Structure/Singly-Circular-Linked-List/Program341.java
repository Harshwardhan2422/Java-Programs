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
            System.gc();
        }
        tail.next = head;
        iCount--;
    }
    
    public void DeleteLast()
    {
        node temp = null;
        
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
            temp = head;
            
            while(temp.next != tail)
            {
                temp = temp.next;
            }
            temp.next = head;
            System.gc();
            tail = temp;            
        }
        tail.next = head;
        iCount--;
    }
    
    public void InsertAtPos(int no, int ipos)
    {
        int Countnode = 0, i = 0;
        node temp = null;
        node newn = null;
        newn = new node();
        newn.data = no;
        newn.next = null;
        
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
            temp = head;
            
            for(i = 1; i < ipos - 1; i++)
            {
                temp = temp.next;
            }
            newn.next = temp.next;
            temp.next = newn;
            iCount++;
        }
    }
    
    public void DeleteAtPos(int ipos)
    {
        int Countnode = 0, i = 0;
        node temp = null;
        node target = null;
        
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
            System.gc();
            iCount--;
        }
    }
    
    public void Display()
    {
        if((head == null) && (tail == null))
        {
            System.out.println("Linklist is Empty!");
            return;
        }
        
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

class Program341
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
              
        sobj.InsertAtPos(75,4);
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
        sobj.DeleteAtPos(4);
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
    }
}
