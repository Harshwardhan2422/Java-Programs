import java.util.Scanner;

class Recursion 
{
    public int iNo;
    
    Recursion(int iNum)
    {
        iNo = iNum;
    }
    
    public void DisplayR()
    {
        if(iNo >= 1)
        {
            System.out.println(iNo);
            iNo--;
            DisplayR();
        }
    }   
}

class Program272
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        Recursion obj = new Recursion(iValue);
        obj.DisplayR();
    }
}