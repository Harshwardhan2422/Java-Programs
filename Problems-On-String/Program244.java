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
        int  iEnd = 0;
        String temp = " ";
        
        iEnd = str.length() - 1;
        
        while(iEnd >= 0)
        {
            temp = temp + str.charAt(iEnd);
            iEnd--;
        }        
        str = temp;                
    } 
}

class Program244
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