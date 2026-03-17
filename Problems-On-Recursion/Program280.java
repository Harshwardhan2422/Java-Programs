import java.util.Scanner;

class CountEven 
{
    public int iNo;
    
    CountEven(int iNum)
    {
        iNo = iNum;
    }
    
    public int Display()
    {
        int iCount = 0, iDigit = 0;
        
        while(iNo != 0)
        {
            iDigit = (iNo % 10);
            if(iDigit % 2 == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
        }
        return iCount;
    }    
}

class Program280
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        CountEven cobj = new CountEven(iValue);
        iRet = cobj.Display();
        
        System.out.println("Count Of Even Digit Is : "+iRet);        
    }
}