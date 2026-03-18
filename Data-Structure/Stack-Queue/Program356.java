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

class queue 
{
    public node head;
    public int iCount;
    
    public queue()
    {
        head = null;
        iCount = 0;
    }
    
    public void enqueue(int no)
    {
        node newn = null;
        node temp = null;
        newn = new node();
        newn.data = no;
        
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
        iCount++;
    }
    
    public int dequeue()
    {
        int iNo = 0;
        
        if(head == null)
        {
            System.out.println("queue is empty");
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
            System.out.println("|"+ temp.data+"|");
            temp = temp.next;
        }
    }
    
    public int Count()
    {
        return iCount;
    }
}

class Program356
{
    public static void main(String A[])
    {
        queue obj = new queue();
        int iRet = 0;
        
        obj.enqueue(101);
        obj.enqueue(51);
        obj.enqueue(21);
        obj.enqueue(11);
        
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = obj.dequeue();
        System.out.println("Remove Element is : " +iRet);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = obj.dequeue();
        System.out.println("Remove Element is : " +iRet);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = obj.dequeue();
        System.out.println("Remove Element is : " +iRet);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
        iRet = obj.dequeue();
        System.out.println("Remove Element is : " +iRet);
        obj.Display();
        iRet = obj.Count();
        System.out.println("Number Of Elements Are : "+iRet);
        System.out.println();
        
    }
}