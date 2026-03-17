import java.util.Scanner;

class Addition
{
    public int iNo;
    
    Addition(int iNum)
    {
        iNo = iNum;
    }
    
    public int Display()
    {
        int iSum = 0, iCnt = 1;
        
        while(iCnt <= iNo)
        {
            iSum = iSum + iCnt;
            iCnt++;
        }
        return iSum;
    }
}

class Program275
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        Addition aobj = new Addition(iValue);
        iRet = aobj.Display();
        
        System.out.println("Addition is : "+iRet);
        
    }
}