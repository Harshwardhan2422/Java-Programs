import java.util.Scanner;

class AddGreatLess
{
    public int iSize;
    public int []Arr;
    
    AddGreatLess(int iNum)
    {
        iSize = iNum;
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int iCnt = 0;
        
        System.out.println("Please Enter the Values : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
    }
    
    public int AdditionLess(int iNo)
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < iNo)
            {
                iSum = iSum + Arr[iCnt];
            }
        }
        return iSum;
    }    
    
    public int AdditionGreater(int iNo)
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iNo)
            {
                iSum = iSum + Arr[iCnt];
            }
        }
        return iSum;
    }
}

class Program110
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0, iValue = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Invalid Size! Size Must Be Greater Than Zero ");
            return;
        }
        
        AddGreatLess aobj = new AddGreatLess(ilength);
        aobj.Accept(sobj);
        
        System.out.println("Enter Element to Compare : ");
        iValue = sobj.nextInt();
        
        iRet = aobj.AdditionLess(iValue);
        System.out.println("Addition Of Less Element is : "+iRet);
        
        iRet = aobj.AdditionGreater(iValue);
        System.out.println("Addition Of Greater Element is : "+iRet);
        
        Scanner.close();            //  Close Scanner Object 
        
    }
}
