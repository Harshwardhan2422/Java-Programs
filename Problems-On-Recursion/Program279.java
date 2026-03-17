import java.util.Scanner;

class SumOfDigit
{
    public int iNo;
    static int iSum;
    
    SumOfDigit(int iNum)
    {
        iNo = iNum;
    }
    
    public int DisplayR()
    {
        if(iNo != 0)        
        {
            iSum = iSum + (iNo % 10);
            iNo = iNo / 10;
            DisplayR();
        }
        return iSum;
    }    
}

class Program279
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        SumOfDigit obj = new SumOfDigit(iValue);
        iRet = obj.DisplayR();
        
        System.out.println("Sum Of Digits Is : "+iRet);
        
    }
}