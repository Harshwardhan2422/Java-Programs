import java.util.*;

class Matrix 
{
    public int Arr[][];
    
    public Matrix(int iRow, int iCol)
    {
        Arr = new int[iRow][iCol];
    }
    
    public void Accept()
    {
        System.out.println("Please Enter The Values : ");
        Scanner sobj = new Scanner(System.in);
        
        int i = 0, j = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        
        System.out.println("Elements Of Matrix Are : ");
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }        
    }
    
    
    
    public int CountEven()
    {
        int i = 0, j = 0, iCount = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] % 2 == 0)
                {
                    iCount++;
                }
            }
        }
        return iCount;
    }
    
    public int SumEven()
    {
        int i = 0, j = 0, iCount = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] % 2 == 0)
                {
                    iCount = iCount + Arr[i][j];
                }
            }
        }
        return iCount;
    }
}

class Program446
{
    public static void main(String A[])
    {  
        int iRow = 0, iCol = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Enter Number Of Rows : ");
        iRow = sobj.nextInt();
        
        System.out.println("Please Enter Number Of Column : ");
        iCol = sobj.nextInt();
        
        Matrix mobj = new Matrix(iRow, iCol);
        
        mobj.Accept();
        mobj.Display();
        
        iRet = mobj.CountEven();
        System.out.println("Number O Even Element in Matrix : "+iRet);
        
        iRet = mobj.SumEven();
        System.out.println("Sum Of Even Element is : "+iRet);
        
    }
}