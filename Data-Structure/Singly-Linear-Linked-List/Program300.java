class node
{
    public int data;
    public node next;
}

class Demo
{
    public void Demo1(node head)
    {
        
    }
}


class Program300
{
    public static void main(String A[])
    {
        node first = new node();
        first = null;
        
        node obj1 = new node();
        node obj2 = new node();
        node obj3 = new node();
        
        obj1.data = 11;
        obj2.data = 21;
        obj3.data = 51;
        
        first = obj1;
        
        Demo dobj = new Demo();
        dobj.Demo1(first);
        
    }
}