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
    
    public void DigitCount()
    {
        int i = 0, j = 0, iCount = 0, iNo = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                iNo = Arr[i][j];
                iCount = 0;
                
                while(iNo != 0)
                {
                    iCount++;
                    iNo = iNo / 10;
                }
                System.out.println("Digit Count of "+Arr[i][j]+" is : "+iCount);
            }            
        }
    }
    
    public void SumDigits()
    {
        int i = 0, j = 0, iSum = 0, iNo = 0, iDigit = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                iNo = Arr[i][j];
                iSum = 0;
                
                while(iNo != 0)
                {
                    iDigit = iNo % 10;
                    iSum = iSum + iDigit;
                    iNo = iNo / 10;
                }
                System.out.println("Sum Of Digits Of "+Arr[i][j]+" is : "+iSum);
            }            
        }        
    }
    
    public int Maximum()
    {
        int i = 0, j = 0;
        int iMax = Arr[0][0];
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
        }
        return iMax;
    }
    
    public int Minimum()
    {
        int i = 0, j = 0;
        int iMin = Arr[0][0];
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
        }
        return iMin;
    }
    
    public void UpdateOdd()
    {
        int i = 0, j = 0, iCount = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(Arr[i][j] % 2 != 0)
                {
                    Arr[i][j]++;
                }
            }
        }
    }
    
    public void MaxRow()
    {
        int i = 0, j = 0;
        int iMax = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            iMax = Arr[i][0];
            
            for(j = 0; j < Arr[i].length; j++)
           {
                if(Arr[i][j] > iMax)
                {
                    iMax = Arr[i][j];
                }
            }
            System.out.println("Maximum Element of Each Row : "+i+" is : "+iMax);
        }
        System.out.println();
    }
    
    public void MinRow()
    {
        int i = 0, j = 0;
        int iMin = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            iMin = Arr[i][0];
            
            for(j = 0; j < Arr[i].length; j++)
           {
                if(Arr[i][j] < iMin)
                {
                    iMin = Arr[i][j];
                }
            }
            System.out.println("Minimum Element of Each Row : "+i+" is : "+iMin);
        }
    }
    
    public int SumDiagonal()
    {
        int i = 0, j = 0, iSum = 0;
        
        if(Arr.length != Arr[0].length)
        {
            System.out.println("Unable To Perform Addition of Diagonal Elements");
            return -1;
        }
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
           {
                if(i == j)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }
    
    public int BorderAdd()
    {
         int i = 0, j = 0, iSum = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                if(i == 0 || i == Arr.length - 1 || j == 0 || j == Arr[i].length - 1)
                {
                    iSum = iSum + Arr[i][j];
                }
            }
        }
        return iSum;
    }
}

class Program455
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
        
        iRet = mobj.BorderAdd();
        System.out.println("Addition of Border Elements is : "+iRet);        
      
    }
}
