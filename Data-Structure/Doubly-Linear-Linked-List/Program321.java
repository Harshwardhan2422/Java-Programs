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
                       
        }
    }
    
    public void Display()
    {
        node temp = null;
        temp = head;
        
        while(temp != null)
        {
            System.out.print("<=>|"+temp.data+"|");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class Program321
{
    public static void main(String A[])
    {
        DoublyLL dobj = new DoublyLL();
        int iRet = 0;
        
        dobj.InsertFirst(51);
        dobj.InsertFirst(21);
        dobj.InsertFirst(11);
        
        dobj.Display();
    }
}