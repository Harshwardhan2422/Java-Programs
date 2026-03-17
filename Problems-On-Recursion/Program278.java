import java.util.Scanner;

class SumOfDigit
{
    public int iNo;
    
    SumOfDigit(int iNum)
    {
        iNo = iNum;
    }
    
    public int Display()
    {
        int iSum = 0;
        
        while(iNo != 0)        
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
        }
        return iSum;
    }    
}

class Program278
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        SumOfDigit obj = new SumOfDigit(iValue);
        iRet = obj.Display();
        
        System.out.println("Sum Of Digits Is : "+iRet);
        
    }
}