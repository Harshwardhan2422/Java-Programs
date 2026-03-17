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
        
        for(iCnt = 1; iCnt < iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("Factors Of "+iNo+" Are :"+iCnt);
            }
        }      
    }
}

class Program51
{
    public static void main(String A[])
    {
        int ivalue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        ivalue = sobj.nextInt();
        
        Demo obj = new Demo(ivalue);
        obj. DisplayFactors();
    }
}