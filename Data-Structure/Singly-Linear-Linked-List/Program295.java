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

class Program295
{
    public static void main(String A[])
    {
         node obj1 = new node();
         node obj2 = new node();
         node obj3 = new node();
         
         obj1.data = 11;
         obj2.data = 21;
         obj3.data = 51;
        
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = null;
               
    }
}