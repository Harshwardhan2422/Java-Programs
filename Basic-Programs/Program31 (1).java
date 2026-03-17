import java.util.Scanner;

class Display
{
    public int iNo = 0;
    
    Display(int iValue)
    {
        iNo = iValue;
    }
    
    public void DisplayResult()
    {
        int iCnt  = 0;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.println("India\t Is \t My \t Country");
        }
    }
}

class Program31
{
    public static void main(String A[])
    {
        int iFrequency = 0;
        
        System.out.println("Enter The Frequency : ");
        Scanner SC = new Scanner(System.in);
        iFrequency = SC.nextInt();
        
        Display dobj = new Display(iFrequency);
        dobj.DisplayResult();
             
    }
}