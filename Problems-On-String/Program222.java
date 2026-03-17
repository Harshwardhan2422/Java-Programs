import java.util.Scanner;

class StrtoggleX 
{
    public String str;
    
    StrtoggleX(String S)
    {
        str = S;
    }
    
    public String Display()
    {
        int i = 0;       
        char Arr[] = str.toCharArray();
        
        for(i = 0; i < Arr.length; i++)
        {
            if(Arr[i] >= 'A' && Arr[i] <= 'Z')
            {
                Arr[i] = (char) (Arr[i] + 32);
            }
            else if(Arr[i] >= 'a' && Arr[i] <= 'z')
            {
                Arr[i] = (char) (Arr[i] - 32);
            }            
        }       
        String newstr = new String(Arr);
        return newstr;        
    }
}

class Program222
{
    public static void main(String A[])
    {
        String svalue = null, sRet = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = sobj.nextLine();
        
        StrtoggleX tobj = new StrtoggleX(svalue);
        sRet = tobj.Display();
        
        System.out.println("String After Updation is : "+sRet);
                
    }
}