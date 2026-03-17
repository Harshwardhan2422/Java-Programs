import java.util.Scanner;

class ToLower
{
    public char ch;
    
    ToLower(char cno)
    {
        ch = cno;
    }
    
    public int Display()
    {
        int iNo = 0;
        
        if((ch >= 'A') && (ch <= 'Z'))
        {
            ch = (char) (ch + 32);
        }
        
        if((ch >= 'a') && (ch <= 'z'))
        {
            if(ch >= 'a' && ch <= 'c')
            iNo = 2;
            
            else if(ch >= 'd' && ch <= 'f')
            iNo = 3;
            
            else if(ch >= 'g' && ch <= 'i')
            iNo = 4;
            
            else if(ch >= 'j' && ch <= 'l')
            iNo = 5;
            
            else if(ch >= 'm' && ch <= 'o')
            iNo = 6;
            
            else if(ch >= 'p' && ch <= 's')
            iNo = 7;
            
            else if(ch >= 't' && ch <= 'v')
            iNo = 8;
            
            else if(ch >= 'w' && ch <= 'z')
            iNo = 9;            
        }
        return iNo;
    }
}

class Program232
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cvalue = '\0';
        int iRet = 0;
        
        System.out.println("Enter Character : ");
        cvalue = sobj.next().charAt(0);
        
        ToLower tobj = new ToLower(cvalue);
        iRet = tobj.Display();
        
        if(iRet < 1)
        {
            System.out.println("Invalid Input!");
        }
        else
        {
            System.out.println("Keypad Number is : "+iRet);
        }
    }
}