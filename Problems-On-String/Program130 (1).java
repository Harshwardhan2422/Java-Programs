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
        
        for(iCnt = iNo; iCnt > 0; iCnt--)
        {
            System.out.println(-iCnt);
        }
        System.out.println();
    }
}

class Program130
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