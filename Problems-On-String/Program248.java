import java.util.Scanner;

class CountCharTypes 
{
    public String str;
    
    CountCharTypes(String sno)
    {
        str = sno;
    }
    
   public void Display()
    {
        int iUpper = 0, iLower = 0, iDigit = 0, iOther = 0;
        int i = 0;
        
        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))            
            {
                iLower++;
            }
            
            else if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iUpper++;
            }
            
            else if((Arr[i] >= '0') && (Arr[i] <= '9'))
            {
                iDigit++;
            }
            else
            {
                iOther++;
            }
        }        
        
        System.out.println("UpperCase Is : "+iUpper);
        System.out.println("Lowercase Is : "+iLower);
        System.out.println("Digits Is : "+iDigit);
        System.out.println("Others Is : "+iOther);       
    }
}

class Program248
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String svalue = null;
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        CountCharTypes cobj = new CountCharTypes(svalue);
        cobj.Display();
        
    }
}