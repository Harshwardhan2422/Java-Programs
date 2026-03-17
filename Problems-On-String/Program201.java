import java.util.Scanner;

class StrlenX
{
    public String str;
    
    StrlenX(String ptr)
    {
        str = ptr;
    }
    
    int Display()
    {
        int iCount = 0;
        
        while(iCount  < str.length())
        {
            iCount++;
        }
        return iCount;
    }    
}

class Program201
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String ilength = null;
        int iRet = 0;
        
        System.out.println("Enter String : ");
        ilength = sobj.nextLine();
        
        StrlenX obj = new StrlenX(ilength);
       iRet = obj.Display();
       System.out.println("Length Of String is : "+iRet);
                       
    }
}