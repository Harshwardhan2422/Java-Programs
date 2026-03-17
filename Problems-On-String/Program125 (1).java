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
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("*%2d ",iCnt);
        }
        System.out.println();      
    }   
}

class Program125
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue = 0;
        System.out.println("Enter The Frequency : ");
        iValue = sobj.nextInt();
        
        DisplayFrequency dobj = new DisplayFrequency(iValue);
        dobj.Display();
    }
}