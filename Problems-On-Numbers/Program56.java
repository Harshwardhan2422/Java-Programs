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
        iCnt = 1;
        
        while(iCnt < iNo)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("Factors Of "+iNo+" Are : "+iCnt);
            }
            iCnt++;
        }
    }
}

class Program56
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
