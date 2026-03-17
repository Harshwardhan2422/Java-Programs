import java.util.Scanner;

class DisplayFrequency
{
    public int iNo;
    
    DisplayFrequency(int iNum)
    {
        iNo = iNum;
    }
    
    public void Display()
    {
        int iCnt = 0;
        
        for(iCnt = -iNo; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%4d",iCnt);
        }
    }   
}

class Program134
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.println("Enter The Frequency : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        DisplayFrequency dobj = new DisplayFrequency(iValue);
        dobj.Display();
    }
}