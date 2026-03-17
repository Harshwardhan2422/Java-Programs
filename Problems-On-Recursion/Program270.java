import java.util.Scanner;

class Recursion 
{
    public int iNo;
    
    Recursion(int iNum)
    {
        iNo = iNum;
    }  
    
    public void DisplayI()
    {
        int iCnt = 0;
        iCnt = 1;
        
        while(iCnt <= iNo)
        {
            System.out.println("*");
            iCnt++;
        }        
    }
}

class Program270
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.print("Enter The Frequency : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        Recursion obj = new Recursion(iValue);
        obj.DisplayI();
        
        System.out.println("End Of Main ");
    }
} 