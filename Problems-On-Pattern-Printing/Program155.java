import java.util.Scanner;

class DisplayFrequency 
{
    public int iNo = 0;
    
    DisplayFrequency(int iNum)
    {
        iNo = iNum;
    }
    public void Display()
    {
        int iCnt = 0;
        char ch = 65;
        
        for(iCnt = 1; iCnt <= iNo; iCnt++, ch++)
        {
            System.out.printf("%4c",ch);
        }
        System.out.println("");
    }  
}

class Program155
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