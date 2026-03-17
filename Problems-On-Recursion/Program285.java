
import java.util.Scanner;

class StrlenX 
{
    public String str; 
        
    StrlenX(String Sno)
    {
        str = Sno;
    }
    
    public int Display()
    {
         int iCount= 0,  i = 0;
        char Arr[] = str.toCharArray();
        
        while(i < Arr.length)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCount++;
            }           
            i++;          
        }
        return iCount;
    }
}

class Program285
{
    public static void main(String A[])
    {
        String svalue = null;
        int iRet = 0;
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = Sc.nextLine();
                
        StrlenX sobj = new StrlenX(svalue);
        iRet = sobj.Display();
        
        System.out.println("String Length Is : "+iRet);
        
    }
}