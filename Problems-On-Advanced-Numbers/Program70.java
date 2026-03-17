import java.util.Scanner;

class Demo
{
    public int Brr[];
    public int iNo;
    
    Demo(int A[], int iValue)
    {
        Brr = A;
        iNo = iValue;
    }
    
    public int Addition()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
        return iSum;      
    }
}

class Program70
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iSize = 0,iCnt = 0,iRet = 0;
        
        System.out.println("Enter Number : ");
        iSize = sobj.nextInt();
        
        if(iSize <= 0)
        {
            System.out.println("Invalid Size !");
            return;
        }
        
        int Arr[] = new int[iSize];
        
        System.out.println("Please Entered the Values : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Demo dobj = new Demo(Arr,iSize);
        iRet = dobj.Addition();
        
        System.out.println("Addition is : "+iRet);
                
    }
}