import java.util.Scanner;

class Recursion 
{
    public int iNo;
    static int iCnt = 0;
    
    Recursion(int iNum)
    {
        iNo = iNum;
    }
    
    public void DisplayR()
    {
        if(iCnt <= iNo)
        {
            System.out.println("*");
            iCnt++;
            DisplayR();
        }
    }
}

class Program269
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        Recursion obj = new Recursion(iValue);
        obj.DisplayR();        
    }
}