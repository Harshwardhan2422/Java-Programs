import java.util.Scanner;

class Addition 
{
    public int iSize;
    public int []Arr;
    
    Addition(int iNo)
    {
        iSize = iNo;
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
    public int DisplayEven()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iSum = iSum + Arr[iCnt];
            }
        }
            return iSum;
    }    
}

class Program84
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must be Greater than zero!");
            return;
        }
        
        Addition aobj = new Addition(ilength);
        aobj.Accept(sobj);
        iRet =aobj.DisplayEven();
        System.out.println("Addition Of Even Elements is : "+iRet);       
        
    }
}