class node
{
    public int data;
    public node next;
    
    node()
    {
        data = 0;
        next = null;
    }
}

class Program293
{
    public static void main(String A[])
    {
        node obj = new node();
        
        obj.data = 10;
        obj.next = obj;
        
        System.out.println(obj.data);       
        System.out.println(obj.next.data);
    }
}