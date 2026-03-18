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
        node newn = null;
        newn = new node();
        newn.data = no;
        node temp = null;
        
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
    
    public void Inorder(node temp)
    {
        if(temp != null)
        {
            Inorder(temp.lchild);
            System.out.print(temp.data+"\t");
            Inorder(temp.rchild);
        }
    }
    
    public void Inorder()
    {
        Inorder(head);
    }
}

class Program358
{
    public static void main(String A[])
    {
        BST obj = new BST();
        
        obj.Insert(21);
        obj.Insert(51);
        obj.Insert(111);
        
        System.out.println("Inorder");
        obj.Inorder();
        
    }
}