import java.util.Scanner;

class WordToKeypad 
{
    public String str;
    
    WordToKeypad(String sNo)
    {
        str = sNo;
    }
    
    public long Display()
    {
        int i = 0;
        long j = 0;
        
        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            int iNo = 0;
            
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char) (Arr[i] + 32);
            }
            
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                if(Arr[i] >= 'a' && Arr[i] <= 'c')
                iNo = 2;
                
                else if(Arr[i] >= 'd' && Arr[i] <= 'f')
                iNo = 3;
                
                else if(Arr[i] >= 'g' && Arr[i] <= 'i')
                iNo = 4;
                
                else if(Arr[i] >= 'j' && Arr[i] <= 'l')
                iNo = 5;
                
                else if(Arr[i] >= 'm' && Arr[i] <= 'o')
                iNo = 6;
                
                else if(Arr[i] >= 'p' && Arr[i] <= 's')
                iNo = 7;
                
                else if(Arr[i] >= 't' && Arr[i] <= 'v')
                iNo = 8;
                
                else if(Arr[i] >= 'w' && Arr[i] <= 'z')
                iNo = 9;
                
                j = j * 10 + iNo;         
            }
        }
        return j;
    }
}

class Program238
{
    public static void main(String A[])
    {
        long  iRet = 0;
        String svalue = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Word : ");
        svalue = sobj.nextLine();
        
        WordToKeypad obj = new WordToKeypad(svalue);
        iRet = obj.Display();
        
        if(iRet < 1)
        {
            System.out.println("Invalid Input!");
        }
        else
        {
            System.out.println("Keypad Sequence : "+iRet);
        }        
    }
}