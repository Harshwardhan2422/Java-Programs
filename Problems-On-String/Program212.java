
import java.util.Scanner;

class Count
{
    public String str;
    
    Count(String ch)
    {
        str = ch;
    }
    
    public int Display()
    {
        int i = 0, iCount = 0;
        
        for(i = 0; i < str.length(); i++)
        {
            if( (str.charAt(i) == 'A')||
                 (str.charAt(i) == 'B')||
                 (str.charAt(i) == 'a')||
                 (str.charAt(i) == 'b') )
                {
                    iCount++;
                }
        }
        return iCount;
    }
}
class Program212
{
    public static void main(String A[])
    {
        String svalue = null;
        int iRet = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        Count cobj = new Count(svalue);
        iRet = cobj.Display();
        System.out.println("Count is : "+iRet);
        
    }
}
