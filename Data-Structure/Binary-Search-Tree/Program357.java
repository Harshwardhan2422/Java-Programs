class node
{
    public int data;
    public node lchild;
    public node rchild;
    
    public node()
    {
        data = 0;
        lchild = null;
        rchild = null;
    }
}

class BST 
{
    public node head;
   
    public BST()
    {
        head = null;
    }
    
    public void Insert(int no)
    {
        node temp = null;
        node newn = null;        
        newn = new node();
        newn.data = no;
        
        if(head == null)
        {
            head = newn;
            return;
        }
        
        temp = head;
        
        while(true)
        {
            if(no > temp.data)
            {
                if(temp.rchild == null)
                {
                    temp.rchild = newn;
                    break;
                }
                temp = temp.rchild;
            }
            
            else if(no < temp.data)
            {
                if(temp.lchild == null)
                {
                    temp.lchild = newn;
                    break;
                }
                temp = temp.lchild;
            }
            
            else
            {
                break;
            }
        }
    }
}

class Program357
{
    public static void main(String A[])
    {
        BST obj = new BST();
        
        obj.Insert(51);
        obj.Insert(21);
        obj.Insert(101);
                
    }
}