
import java.util.Scanner;

class StrlenX 
{
    public String str; 
    static int iCount;
    static int i = 0;
    
    StrlenX(String Sno)
    {
        str = Sno;
    }
    
    public int DisplayR()
    {
        char Arr[] = str.toCharArray();
        
        if(i < Arr.length)
        {
            if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
            {
                iCount++;
            }           
            i++;          
            DisplayR();
        }
        return iCount;
    }
}

class Program284
{
    public static void main(String A[])
    {
        String svalue = null;
        int iRet = 0;
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        svalue = Sc.nextLine();
                
        StrlenX sobj = new StrlenX(svalue);
        iRet = sobj.DisplayR();
        
        System.out.println("String Length Is : "+iRet);
        
    }
}