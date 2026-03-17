import java.util.Scanner;

class CountWordSpace
{
    public String str;
    
    CountWordSpace(String sno)
    {
        str = sno;
    }
    
    public void Display()
    {
        int iSpace = 0, iWord = 0, iSpecial = 0;
        int i = 0;
        
        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char) (Arr[i] - 32);
            }
            
            if(Arr[i] == ' ')
            {
                iSpace++;
            }
            
            else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                if((i == 0) || (Arr[i - 1] == ' '))
                {
                    iWord++;
                }
            }
            else
            {
                iSpecial++;
            }
        }
        
        System.out.println("Word : "+iWord);
        System.out.println("Space : "+iSpace);
        System.out.println("Special : "+iSpecial);
        
    }
}

class Program250
{
    public static void main(String A[])
    {
        String svalue = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        CountWordSpace cobj = new CountWordSpace(svalue);
        cobj.Display();
        
    }
}