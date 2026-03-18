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

class SinglyLL 
{
    public node head;
    
    public SinglyLL()
    {
        head = null;
    }
 }

class Program304
{
    public static void main(String A[])
    {
        SinglyLL sobj = new SinglyLL();
        System.out.println("Linked List is empty");
    }
}