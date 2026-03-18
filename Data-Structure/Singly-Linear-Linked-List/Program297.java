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

class Program297
{
    public static void main(String A[])
    {
        node first = new node();
        first = null;
        
        node obj1 = new node();
        node obj2 = new node();
        node obj3 = new node();
        node obj4 = new node();
        
        obj1.data = 10;
        obj2.data = 20;
        obj3.data = 30;
        obj4.data = 40;
        
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = null;
        
        first = obj1;
        
        System.out.println(first.data);
        System.out.println(first.next.data);
        System.out.println(first.next.next.data);
        System.out.println(first.next.next.next.data);
                
    }   
}