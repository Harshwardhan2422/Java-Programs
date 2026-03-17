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
        
        for(iCnt = iNo; iCnt >= 1; iCnt--)
        {
            System.out.printf("%4d",iCnt);
        }
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%4d",iCnt);
        }
    }  
}

class Program127
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        DisplayFrequency dobj = new DisplayFrequency(iValue);
        dobj.Display();   
    }
}