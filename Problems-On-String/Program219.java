import java.util.Scanner;

class LowerCase
{
    public String str;
    
    LowerCase(String ch)
    {
        str = ch;
    }
    
    public String Display()
    {
        int i = 0;
        
        char Arr[] = str.toCharArray();
        
        while(i < Arr.length)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                Arr[i] = (char) (Arr[i] + 32);
            }
            i++;
        }             
        
        String newstr = new String(Arr);
        return newstr;
    }
}

class Program219
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String svalue = null, sRet = null;
        
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        LowerCase lobj = new LowerCase(svalue);
        sRet = lobj.Display();
        
        System.out.println("String After Updation is : "+sRet);
    }
}