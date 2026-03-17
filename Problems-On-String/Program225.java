import java.util.Scanner;

class AlphabetPosition 
{
    public char ch;
    
    AlphabetPosition(char cNo)
    {
        ch = cNo;
    }
    
    public int Display()
    {
        int iCount = 0;
        
        if((ch >= 'A') && (ch <= 'Z'))
        {
            iCount = ch - 'A' + 1;
        }
        else if((ch >= 'a') && (ch <= 'z'))
        {
            iCount = ch - 'a' + 1;
        }
        return iCount;      
    }
}

class Program225
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cvalue = '\0';
        int iRet = 0;
        
        System.out.println("Enter Character : ");
        cvalue = sobj.next().charAt(0);
        
        AlphabetPosition aobj = new AlphabetPosition(cvalue);
        iRet = aobj.Display();
        
        if(iRet == 0)
        {
            System.out.println("Invalid Input!");
        }
        else
        {
            System.out.println("Alphabet Position of "+cvalue+" Is : "+iRet);
        }     
        sobj.close();
    }
}