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
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char) (Arr[i] - 32);
            }
            
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                if(Arr[i] <= 'C')
                j = j * 10 + 2;
                
                else if(Arr[i] <= 'F')
                j = j * 10 + 3;
                
                else if(Arr[i] <= 'I')
                j = j * 10 + 4;
                
                else if(Arr[i] <= 'L')
                j = j * 10 + 5;
                
                else if(Arr[i] <= 'O')
                j = j * 10 + 6;
                
                else if(Arr[i] <= 'S')
                j = j * 10 + 7;
                
                else if(Arr[i] <= 'V')
                j = j * 10 + 8;
                
                else if(Arr[i] <= 'Z')
                j = j * 10 + 9;
            }
        }
        return j;
    }    
}

class Program240
{
    public static void main(String A[])
    {
        String svalue = null;
        long iRet = 0;
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
            System.out.println("Keypad Sequence is : "+iRet);
        }       
    }
}