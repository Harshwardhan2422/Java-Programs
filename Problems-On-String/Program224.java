import java.util.Scanner;

class Count
{
    public char ch;
    
    Count(char cNo)
    {
        ch = cNo;
    }
    
    public int Display()
    {
        int iCount = 0;
        
        if((ch >= 'a') && (ch <= 'z'))
        {
            iCount = ch - 'a' + 1;
        }
        return iCount;
    }
}


class Program224
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cvalue = '\0';
        int iRet = 0;
        
        System.out.println("Enter Character : ");
        cvalue = sobj.next().charAt(0);
        
        Count cobj = new Count(cvalue);
        iRet = cobj.Display();
        
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