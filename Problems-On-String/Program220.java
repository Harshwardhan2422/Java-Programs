import java.util.Scanner;

class UpperCase
{
    public String str;
    
    UpperCase(String ch)
    {
        str = ch;
    }
    
    public String Display()
    {
        int i = 0;
        
        char Arr[] = str.toCharArray();
        
        while(i < Arr.length)
        {
            if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
            {
                Arr[i] = (char) (Arr[i] - 32);
            }
            i++;
        }             
        
        String newstr = new String(Arr);
        return newstr;
    }
}

class Program220
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String svalue = null, sRet = null;
        
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        UpperCase obj = new UpperCase(svalue);
        sRet = obj.Display();
        
        System.out.println("String After Updation is : "+sRet);
    }
}