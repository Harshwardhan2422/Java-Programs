import java.util.Scanner;

class NumToAlpha 
{
    public int iNo, iCase;
    
    NumToAlpha(int iNum1, int iNum2)
    {
        iNo = iNum1;
        iCase = iNum2;
    }
    
    public char Display()
    {
        char ch = '\0';
        
        if((iNo >= 1) && (iNo <= 26) && ((iCase == 1) || (iCase == 2)))
        {
            if(iCase == 1)
            {
                ch = (char) ('A' + iNo - 1);
            }
            else
            {
                ch = (char) ('a' + iNo - 1);
            }
        }
        return ch;
    }
}

class Program229
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0,iValue2 = 0;
        char cRet = '\0';
        
        System.out.println("Enter Number : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Case (1 for UpperCase,  2 for LowerCase)");
        iValue2 = sobj.nextInt();
        
        NumToAlpha nobj = new NumToAlpha(iValue1,iValue2);
        cRet = nobj.Display();
        
        if(cRet == '\0')
        {
            System.out.println("Invalid Input!");
        }
        else
        {
            System.out.println("Number "+iValue1+" Corresponding Alphabet Is : "+cRet);
        }
        sobj.close();       
    }
}