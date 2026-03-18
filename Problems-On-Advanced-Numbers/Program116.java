import java.util.Scanner;

class GreaterCount
{
    public int iSize;
    public int []Arr;
    
    GreaterCount(int iNum)
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
    
    public int DisplayCount(int iNo)
    {
        int iCount = 0, iCnt = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iNo)
            {
                iCount++;
            }
        }
        return iCount;     
    }
}

class Program116
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0, iValue = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must Be Greater Than Zero!");
            return;
        }
        
        GreaterCount gobj = new GreaterCount(ilength);
        gobj.Accept(sobj);
        
        System.out.println("Enter Number To Compare : ");
        iValue = sobj.nextInt();
        
        iRet = gobj.DisplayCount(iValue);
        System.out.println("Element Greater than "+iValue+" is : "+iRet);
                
    }
}
