import java.util.Scanner;

class Recursion 
{
    public int iNo;
    static int iCnt = 1;
    
    Recursion(int iNum)
    {
        iNo = iNum;
    }
    
    public void DisplayR()
    {
        if(iCnt <= iNo)
        {
            System.out.println(iCnt);
            iCnt++;
            DisplayR();
        }
    }  
}

class Program271
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.print("Enter The Frequency : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        Recursion obj = new Recursion(iValue);
        obj.DisplayR();      
        
        System.out.println("End Of Main ");
    }
}