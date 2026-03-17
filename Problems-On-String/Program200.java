import java.util.Scanner;

class DisplayString
{
    public String Brr;
    
    DisplayString(String Crr)
    {
        Brr = Crr;
    }
    
    public void Display()
    {
        int ptr = 0;
        
        while(ptr < Brr.length())
        {
            System.out.println(Brr.charAt(ptr));
            ptr++;
        }       
    }
}

class Program200
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr;
        
        System.out.println("Enter String : ");
        Arr = sobj.nextLine();
        
        DisplayString dobj = new DisplayString(Arr);
        dobj.Display();
    }
}