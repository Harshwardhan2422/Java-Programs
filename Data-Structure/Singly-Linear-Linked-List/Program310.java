class node
{
    public int data;
    public node next;
    
    public node(int x)
    {
        data = x;
        next = null;
    }
}

class SinglyLL 
{
    public node head;
    
    public SinglyLL()
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
         }
    }
    
    public void Display()
    {
        node temp = null;
        temp = head;
        
        while(temp != null)
        {
            System.out.print("|"+temp.data+"|->");
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
            head = head.next;
            System.gc();           
        }
    }
}

class Program310
{
    public static void main(String A[])
    {
        SinglyLL sobj = new SinglyLL();
        int iRet = 0;
        
        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);
        
        sobj.InsertLast(101);
        sobj.InsertLast(111);
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        
        sobj.DeleteFirst();
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
               
    }
}