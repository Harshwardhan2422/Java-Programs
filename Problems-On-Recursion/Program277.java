import java.util.Scanner;

class CountDigit 
{
    public int iNo;
    static int iCount;
    
    CountDigit(int iNum)
    {
        iNo = iNum;
    }
    
    public int DisplayR()
    {
        if(iNo != 0)
        {
            iNo = iNo / 10;
            iCount++;
            DisplayR();
        }
        return iCount;
    }
}

class Program277
{
    public static void main(String A[])
    {
        int iValue = 0, iRet = 0;
        
        System.out.println("Enter The Frequency : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        CountDigit cobj = new CountDigit(iValue);
        iRet = cobj.DisplayR();
        
        System.out.println("Count Of Digits is : "+iRet);
        
    }
}