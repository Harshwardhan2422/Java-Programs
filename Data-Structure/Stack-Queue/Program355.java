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
        int iNo = 0;
        
        if(head == null)
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        
        else if(head.next == null)
        {
            iNo = head.data;
            head = null;
            iCount--;
        }
        
        else
        {
            iNo = head.data;
            head = head.next;
            iCount--;
        }
        return iNo;
    }
    
    public void Display()
    {
        node temp = head;
        
        while(temp != null)
        {
            System.out.println("|"+temp.data+"|");
            temp = temp.next;
        }
    }
    
    public int Count()
    {
        return iCount;
    }
}

class Program355
{
    public static void main(String A[])
    {
        Stack sobj = new Stack();
        int iRet = 0;        
        
        sobj.Push(101);
        sobj.Push(51);
        sobj.Push(21);
        sobj.Push(11);
        
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = sobj.Pop();
        System.out.println("Pop Element is : "+iRet);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = sobj.Pop();
        System.out.println("Pop Element is : "+iRet);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = sobj.Pop();
        System.out.println("Pop Element is : "+iRet);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = sobj.Pop();
        System.out.println("Pop Element is : "+iRet);
        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
         
    }
}