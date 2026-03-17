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

class Program216
{
    public static void main(String A[])
    {
        String svalue = null;
        int iRet = 0;
        char cNo = '\0';
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        System.out.println("Enter The Character : ");
        cNo = sobj.next().charAt(0);
        
        Count cobj = new Count(svalue, cNo);
        iRet = cobj.Display();
        System.out.println("Count of " + cNo + " is : "+iRet);
        
    }
}
