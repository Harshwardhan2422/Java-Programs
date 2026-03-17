import java.util.Scanner;

class Demo
{
    public int iNo;
    
    Demo(int A)
    {
        iNo = A;
    }
    
    public void DisplayFactors()
    {
        int iCnt = 0;
        
        if(iNo == 0)        // Filter 
        {
            System.out.println("0 Has Infinity Factors!");
            return;
        }
        if(iNo < 0)
        {
            iNo = -iNo;        // Updator 
        }
        
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("Factors Of "+iNo+" Are : "+iCnt);         
            }
        }
    }
}

class Program53
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        Demo obj = new Demo(iValue);
        obj.DisplayFactors();
    }
}