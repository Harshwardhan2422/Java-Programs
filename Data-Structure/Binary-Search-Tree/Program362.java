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
    
    boolean Search(int no)
    {
        node temp = head;
        boolean bFlag = false;
        
        while(temp != null)
        {
            if(no == temp.data)
            {
                bFlag = true;
                break;
            }
            else if(no > temp.data)
            {
                temp = temp.rchild;
            }
            else
            {
                temp = temp.lchild;
            }
        }        
        return bFlag;
    }
}

class Program362
{
    public static void main(String A[])
    {
        BST obj = new BST();
        boolean bRet = false;
        
        obj.Insert(21);
        obj.Insert(11);
        obj.Insert(51);
        obj.Insert(35);
        obj.Insert(75);
        obj.Insert(18);
        obj.Insert(9);
        
        bRet = obj.Search(111);
        
        if(bRet == true)
        {
            System.out.println("Element is present in BST");
        }
        else 
        {
            System.out.println("There is no such Element in BST");
        }      
    }
}