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
    
    public void Preorder(node temp)
    {
        if(temp != null)
        {
            System.out.print(temp.data+"\t");
            Preorder(temp.lchild);
            Preorder(temp.rchild);
        }
    }
    public void Preorder()
    {
        Preorder(head);
    }
    
    public void Postorder(node temp)
    {
        if(temp != null)
       {
            Postorder(temp.lchild);
            Postorder(temp.rchild);
            System.out.print(temp.data+"\t");
        }
    }
    public void Postorder()
    {
        Postorder(head);
    }
    
    
}

class Program360
{
    public static void main(String A[])
    {
        BST obj = new BST();
        
        obj.Insert(21);
        obj.Insert(11);
        obj.Insert(51);
        obj.Insert(35);
        obj.Insert(75);
        obj.Insert(18);
        obj.Insert(9);
        
        System.out.println("Inorder");
        obj.Inorder();
        System.out.println();
        
        System.out.println("Preorder");
        obj.Preorder();
        System.out.println();
        
        System.out.println("Postorder");
        obj.Postorder();
        System.out.println();
        
    }
}