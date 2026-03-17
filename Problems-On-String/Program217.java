import java.util.Scanner;

class Check
{
    public String str;
    public char cvalue;
    
    Check(String ch, char C)
    {
        str = ch;
        cvalue = C;
    }
    
    public boolean Display()
    {
        int i = 0;
        boolean bFlag = false;
        
        while(i < str.length())
        {
            if(str.charAt(i) == cvalue)
            {
                bFlag = true;
                break;
            }
            i++;
        }
        return bFlag;
    }
}

class Program217
{
    public static void main(String A[])
    {
        String svalue = null;
        boolean bRet = false;
        char cNo = '\0';
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        System.out.println("Enter The Character : ");
        cNo = sobj.next().charAt(0);
        
        Check cobj = new Check(svalue, cNo);
        bRet = cobj.Display();
        
        if(bRet == true)
        {
            System.out.println("Character is Present ");
        }
        else
        {
            System.out.println("Character Not is Present ");
        }
    }
}
