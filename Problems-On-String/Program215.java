import java.util.Scanner;

class Count
{
    public String str;
    public char cvalue;
    
    Count(String ch, char C)
    {
        str = ch;
        cvalue = C;
    }
    
    public int Display()
    {
        int i = 0, iCount = 0;
        
        while(i < str.length())
        {
            if(str.charAt(i) == cvalue)
            {
                iCount++;
            }
            i++;
        }
        return iCount;
    }
}

class Program215
{
    public static void main(String A[])
    {
        String svalue = null;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        Count cobj = new Count(svalue, 'm');
        iRet = cobj.Display();
        System.out.println("Count of m is : "+iRet);
        
    }
}
