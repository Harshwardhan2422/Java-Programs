import java.util.Scanner;

class Program50
{
    public static void main(String A[])
    {
        int iNo = 0, iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();        
        
        for(iCnt = 1; iCnt <  iNo; iCnt++)
        {
            if(iNo % iCnt == 0)
            {
                System.out.println("Factors Of "+iNo+" Are : "+iCnt);
            }
        }               
    }
}