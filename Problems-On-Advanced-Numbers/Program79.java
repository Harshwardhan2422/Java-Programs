import java.util.Scanner;

class DisplayResult 
{
    public int ptr[];
    public int iSize;
    
    DisplayResult(int Brr[],int iNo)
    {
        ptr = Brr;
        iSize = iNo;
    }
    
    public int Addition()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + ptr[iCnt];
        }
        return iSum;
    }   
}

class Program79
{
    public static void main(String A[])
    {
        int ilength = 0, iCnt = 0, iRet  = 0;
        int Arr[];
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        Arr = new int[ilength];
        
        System.out.println("Please Entered the Values : ");
        for(iCnt = 0; iCnt < ilength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        DisplayResult dobj = new DisplayResult(Arr, ilength);
        iRet = dobj.Addition();
        
        System.out.println("Addition is : "+iRet);
        
    }
}