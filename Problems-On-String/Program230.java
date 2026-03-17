import java.util.Scanner;


class ToUpperX 
{
    public char ch;
    
    ToUpperX(char cNo)
    {
        ch = cNo;
    }
    
    public int Display()
    {
        int iNo = 0;
        if((ch >= 'A') && (ch <= 'Z'))
        {
            if(ch >= 'A' && ch <= 'C')
            iNo = 2;
            
            else if(ch >= 'D' && ch <= 'F')
            iNo = 3;
            
            else if(ch >= 'G' && ch <= 'I')
            iNo = 4;
            
            else if(ch >= 'J' && ch <= 'L')
            iNo = 5;
            
            else if(ch >= 'M' && ch <= 'O')
            iNo = 6;
            
            else if(ch >= 'P' && ch <= 'S')
            iNo = 7;
            
            else if(ch >= 'T' && ch <= 'V')
            iNo = 8;
            
            else if(ch >= 'W' && ch <= 'Z')
            iNo = 9;            
        }
        return iNo;
    }
}

class Program230
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        char cvalue = '\0';
        int iRet = 0;
        
        System.out.println("Enter Character : ");
        cvalue = sobj.next().charAt(0);
        
        ToUpperX tobj = new ToUpperX(cvalue);
        iRet = tobj.Display();
       
       if(iRet < 1)
       {
           System.out.println("Invalid Input!");
       }
       else
       {
           System.out.printf("Keypad Number is : "+iRet);
       }        
    }
}