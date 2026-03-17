import java.util.Scanner;

class DisplayResult 
{
    public String str;
    
    DisplayResult(String ch)
    {
        str = ch;
    }
    
    public void Display()
    {
        int i = 0;
        System.out.println("Entered String is : ");
        
        for(i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
class Program211
{
    public static void main(String A[])
    {
        String svalue = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        DisplayResult dobj = new DisplayResult(svalue);
        dobj.Display();
        
    }
}