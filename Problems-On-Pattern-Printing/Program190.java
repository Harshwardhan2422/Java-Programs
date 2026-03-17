
import java.util.Scanner;

class PatternDisplay 
{
    public int iNo;
    
    PatternDisplay(int iNum)
    {
        iNo = iNum;
    }
    
    public void Display()
    {
        int i = 0, j = 0, k = 0;
        
        for(i = 1; i <= iNo; i++)
        {
            for(k = i; k < iNo; k++)
            {
                System.out.printf("%4c",' ');
            }
            for(j = 1; j <=(i * 2 - 1);  j++)
            {
                System.out.printf("%4c",'*');
            }
            System.out.println();
        }
        
        for(i = iNo - 1; i >= 1; i--)
        {
            for(k = i; k < iNo; k++)
            {
                System.out.printf("%4c",' ');
            }
            for(j = 1; j <=(i * 2 - 1);  j++)
            {
                System.out.printf("%4c",'*');
            }
            System.out.println();
        }
    }   
}

class Program190
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        PatternDisplay obj = new PatternDisplay(iValue);
        obj.Display();
    }
}