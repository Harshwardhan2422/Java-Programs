import java.util.Scanner;

class Program42
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iNo = 0;
        boolean bRet = false;
        System.out.println("Enter Number : ");
        iNo = sobj.nextInt();
        
        bRet = (iNo % 5 == 0);
        
        if(bRet == true)
        {
            System.out.println("Divisible By 5 : "+iNo);
        }
        else
        {
            System.out.println("Not Divisible By 5 : "+iNo);
        }                    
    }
}

