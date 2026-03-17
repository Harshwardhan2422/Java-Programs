import java.util.Scanner;

class Pattern 
{
    public int iNo;
    
    Pattern(int i)
    {
        iNo = i;
    }
    
    public void Display()
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.print("*\t");
        }
    }
}

class Program122
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.println("Enter Frequency : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        Pattern pobj = new Pattern(iValue);
        pobj.Display();
        
    }
}