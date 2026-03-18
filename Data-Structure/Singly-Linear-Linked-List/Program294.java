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

class Program294
{
    public static void main(String A[])
    {
        node obj = new node();
        
        obj.data = 10;
        obj.next = obj;
        
        System.out.println("Value Of data is : "+obj.data);
        System.out.println("Value Of next is : "+obj.next.data);
    }
}