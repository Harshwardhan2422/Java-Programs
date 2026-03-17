import java.util.Scanner;

class Addition 
{
    public int []Arr;
    public int iSize;
    
    Addition(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];
    }
    
    public void Accept()
    {
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Please Entered the Values : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
    }
    
    public int Display()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return iSum;
    }
    
}

class Program81
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int ilength = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        Addition aobj = new Addition(ilength);
        
        aobj.Accept();
        iRet = aobj.Display();
        System.out.println("Addition is : "+iRet);
        
    }
}