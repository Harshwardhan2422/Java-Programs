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

class Program292
{
    public static void main(String A[])
    {
        node obj = new node();
        
        obj.data = 10;
        
        System.out.println(obj.data);       
    }
}