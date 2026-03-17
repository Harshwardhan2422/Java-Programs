import java.util.Scanner;

class NumToAlpha 
{
    public int iNo;
    
    NumToAlpha(int iNum)
    {
        iNo = iNum;
    }
    
    public char Display()
    {
        char ch = '\0';
        
        if((iNo >= 1) && (iNo <= 26))
        {
            ch = (char) ('A' + iNo - 1);
        }
        return ch;
    }  
}

class Program226
{
    public static void main(String A[])
    {
        int iValue = 0;
        char cRet = '\0';
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        NumToAlpha nobj = new NumToAlpha(iValue);
        cRet = nobj.Display();
        
        if(cRet == '\0')
        {
            System.out.println("Invalid Input!");
        }
        else
        {
            System.out.println("Number "+iValue+" Corresponding Alphabet is : "+cRet);
        }
        sobj.close();
    }
}