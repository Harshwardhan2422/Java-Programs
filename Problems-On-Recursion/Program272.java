import java.util.Scanner;

class DisplayResult 
{
    public int iNo;
    
    DisplayResult(int iNum)
    {
        iNo = iNum;
    }
    
    public void Display()
    {
        while(iNo >= 1)
        {
            System.out.println(iNo);
            iNo--;
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
        
        DisplayResult dobj = new DisplayResult(iValue);
        dobj.Display();
    }
}