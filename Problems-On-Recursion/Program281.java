import java.util.Scanner;

class CountEven 
{
    public int iNo;
    static int iCount;
    
    CountEven(int iNum)
    {
        iNo = iNum;
    }
    
    public int DisplayR()
    {
        int iDigit = 0;
        
        if(iNo != 0)
        {
            iDigit = (iNo % 10);
            
            if(iDigit % 2 == 0)
            {
                iCount++;
            }
            iNo = iNo / 10;
            DisplayR();
        }
        return iCount;
    }
}

class Program281
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        CountEven cobj = new CountEven(iValue);
        iRet = cobj.DisplayR();
        
        System.out.println("Even Digit Is : "+iRet);
        
    }
}