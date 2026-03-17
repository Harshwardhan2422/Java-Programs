import java.util.Scanner;

class Count
{
    public String Str;
    
    Count(String ptr)
    {
        Str = ptr;
    }
    
    int Display()
    {
        int iCount = 0;
        int i = 0;
        
        while(i < Str.length())
        {
            if((Str.charAt(i) >= 'A')  &&  (Str.charAt(i) <= 'Z'))
            {
                iCount++;
            }
            i++;
        }
        return iCount;
    }
}

class Program206
{
    public static void main(String A[])
    {
        int iRet = 0;
        String S1 = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        S1 = sobj.nextLine();
        
        Count cobj = new Count(S1);
        iRet = cobj.Display();
        System.out.println("Count Of Capital Letters is : "+iRet);
    }
}