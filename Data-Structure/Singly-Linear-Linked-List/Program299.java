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

class Program299
{
    public static void main(String A[])
    {
        node first = new node();
        first = null;
        
        node obj1 = new node();
        node obj2 = new node();
        node obj3 = new node();
        
        obj1.data = 11;            // Ox100
        obj2.data = 21;         // Ox200
        obj3.data = 51;        // Ox300
        
        obj1.next = obj2;
        obj2.next = obj3;
        obj3.next = null;
        
        first = obj1;            // Ox50
        
        System.out.println(first.data);                          // 11
        System.out.println(first.next.data);                 // 21
        System.out.println(first.next.next.data);        // 51
                
    }   
}