import java.util.Scanner;

class Update 
{
    public String str;
    
    Update(String ch)
    {
        str = ch;
    }
    
    public String Display()
    {
        int i = 0;
        
        char  Arr[] = str.toCharArray();
        
        while(i < Arr.length)
        {
            if(Arr[i] == 'M')
            {
                Arr[i] = 'H';
            }
            i++;
        }
        
        String newstr = new  String(Arr);
        return newstr;
    }
}

class Program218
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String svalue = null, sRet = null;
        
        
        System.out.print("Enter String : ");
        svalue = sobj.nextLine();
        
        Update obj = new Update(svalue);
        sRet = obj.Display();
        
        System.out.println("String After Updation is : "+sRet);
    }
}