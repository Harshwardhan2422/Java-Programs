import java.util.Scanner;

class Addition
{
    public int iNo;
    static int iSum;
    static int iCnt = 1;
    
    Addition(int iNum)
    {
        iNo = iNum;
    }
    
    public int DisplayR()
    {        
        if(iCnt <= iNo)
        {
            iSum = iSum + iCnt;
            iCnt++;
            DisplayR();
        }
        return iSum;
    }
}

class Program276
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, iRet = 0;
        
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        Addition aobj = new Addition(iValue);
        iRet = aobj.DisplayR();
        
        System.out.println("Addition is : "+iRet);       
    }
}