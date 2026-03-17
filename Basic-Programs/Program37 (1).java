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
        int iCnt = 0;
        iCnt = 1;
        
        while(iCnt <= iNo)
        {
            System.out.println("\n Never Give Up \n");
            iCnt++;
        }
    }
}

class Program37
{
    public static void main(String A[])
    {
        int iFrequency = 0;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter The Frequency : ");
        iFrequency = Sobj.nextInt();
        
        Display dobj = new Display(iFrequency);
        dobj.DisplayResult();
        
    }
}