import java.util.Scanner;

class Addition 
{
    public int fAdd = 0;
    
    public int AdditionInt(int ivalue1, int ivalue2)
    {
        // Updator 
        if(ivalue1 < 0)
        {
            ivalue1 = -ivalue1;
        }
        if(ivalue2 < 0)
        {
            ivalue2 = -ivalue2;
        }
        
        fAdd = ivalue1 + ivalue2;
        return fAdd;
    }
}
class Program09
{
    public static void main(String A[])
    {
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        iNo1 = sc.nextInt();
        
        System.out.println("Enter Second Number : ");
        iNo2 = sc.nextInt();
        
        Addition aobj = new Addition();
        iAns = aobj.AdditionInt(iNo1, iNo2);
        
        System.out.println("Addition is : "+iAns);
              
    }
}
