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
    
    public boolean Search(int no)
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
    
    public int Max()
    {
        node temp = null;
        temp = head;
        
        if(temp == null)
        {
            return -1;
        }
        
        while(temp.rchild != null)
        {
            temp = temp.rchild;
        }
        return temp.data;
    }
    
    public int Min()
    {
        node temp = null;
        temp = head;
        
        if(temp == null)
        {
            return -1;
        }
        
        while(temp.lchild != null)
        {
            temp = temp.lchild;
        }
        return temp.data;
    }
    
    public int Countnode(node temp)
    {
        int iCount = 0;
        
        if(temp != null)
        {
            iCount++;
            
            iCount = iCount + Countnode(temp.lchild);
            iCount = iCount + Countnode(temp.rchild);            
        }
        return iCount;
    }
    
    public int CountParentNode(node temp)
    {
        int iCount = 0;
        
        if(temp != null)
        {
            if((temp.rchild != null) || (temp.lchild != null))
            {
                iCount++;   
            }        
            iCount = iCount + CountParentNode(temp.lchild);
            iCount = iCount + CountParentNode(temp.rchild);    
        }
        return iCount;
    }
    
    public int CountLeafNode(node temp)
    {
        int iCount = 0;
        
        if(temp != null)
        {
            if((temp.rchild == null) && (temp.lchild == null))
            {
                iCount++;   
            }        
            iCount = iCount + CountLeafNode(temp.lchild);
            iCount = iCount + CountLeafNode(temp.rchild);    
        }
        return iCount;
    }
    
}

class Program367
{
    public static void main(String A[])
    {
        BST obj = new BST();
        int iRet = 0;
        boolean bRet = false;
        
        obj.Insert(21);
        obj.Insert(11);
        obj.Insert(51);
        obj.Insert(35);
        obj.Insert(75);
        obj.Insert(18);
        obj.Insert(9);
        
        iRet = obj.Countnode(obj.head);
        System.out.println("Total Number Of node are : "+iRet);
        
        iRet = obj.CountParentNode(obj.head);
        System.out.println("Total Number Of Parent node are : "+iRet);
        
        iRet = obj.CountLeafNode(obj.head);
        System.out.println("Total Number Of Leaf node Are : "+iRet);
               
    }
}
