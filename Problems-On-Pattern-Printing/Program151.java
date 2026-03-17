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
        char ch = 'a';
        
        for(iCnt = 1; iCnt <= iNo; iCnt++)
        {
            System.out.printf("%4c",ch);
            ch++;
        }
        System.out.println("");
    }
}
class Program151
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