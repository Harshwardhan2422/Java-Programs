
import java.util.Scanner;

class Demo
{
    public int iNo1, iNo2;
    
    Demo(int A,int B)
    {
        iNo1 = A;
        iNo2 = B;
    }
    
    boolean DisplayFactors()
    {
        if(iNo2 == 0)
        {
            System.out.println("Divisor Cannot be zero!");
            return false;
        }
        
        if(iNo1 % iNo2 == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

class Program46
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0;
        boolean bRet = false;
        
        System.out.println("Enter Number : ");
        iValue1 = sobj.nextInt();
        
        System.out.println("Enter Divisor : ");
        iValue2 = sobj.nextInt();
        
        Demo obj = new Demo(iValue1, iValue2);
        bRet = obj.DisplayFactors();
        
        if(bRet == true)
        {
            System.out.println(iValue1+"Divisible By :  "+iValue2);
        }
        else
        {
            System.out.println(iValue1+"Not Divisible By :  "+iValue2);
        }
        
    }
}