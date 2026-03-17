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
            
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char) (Arr[i] - 32);
            }
            
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                if(Arr[i] >= 'A' && Arr[i] <= 'C')
                iNo = 2;
                
                else if(Arr[i] >= 'D' && Arr[i] <= 'F')
                iNo = 3;
                
                else if(Arr[i] >= 'G' && Arr[i] <= 'I')
                iNo = 4;
                
                else if(Arr[i] >= 'J' && Arr[i] <= 'L')
                iNo = 5;
                
                else if(Arr[i] >= 'M' && Arr[i] <= 'O')
                iNo = 6;
                
                else if(Arr[i] >= 'P' && Arr[i] <= 'S')
                iNo = 7;
                
                else if(Arr[i] >= 'T' && Arr[i] <= 'V')
                iNo = 8;
                
                else if(Arr[i] >= 'W' && Arr[i] <= 'Z')
                iNo = 9;
                
                j = j * 10 + iNo;         
            }
        }
        return j;
    }
}

class Program239
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