import java.util.Scanner;

class ReverseString 
{
    public String str;
    
    ReverseString(String Sno)
    {
        str = Sno;
    }
    
    public void Display()
    {
        int iStart = 0, iEnd = 0;
        char temp = '\0';
        
        char Arr[] = str.toCharArray();
        
        iEnd = Arr.length - 1;
        
        while(iStart < iEnd)
        {
            temp = Arr[iStart];
            Arr[iStart] = Arr[iEnd];
            Arr[iEnd] = temp;
            
            iStart++;
            iEnd--;
        }
        
        str = new String(Arr);
    } 
}

class Program241
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String svalue = null;
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        ReverseString obj = new ReverseString(svalue);
        obj.Display();
        
        System.out.println("Reverse String Is : "+obj.str);
                
    }
}