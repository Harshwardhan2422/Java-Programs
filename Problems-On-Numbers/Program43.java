import java.util.Scanner;

class Demo
{
    public int iNo = 0;
    
    Demo(int A)
    {
        iNo = A;
    }
    
    boolean DisplayFactors()
    {
        int iResult = 0;
        iResult = iNo % 5;
        
        if(iResult == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}

class Program43
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number : ");
        iValue = sobj.nextInt();
        
        Demo obj = new Demo(iValue);
        
        bRet = obj.DisplayFactors();
        
        if(bRet == true)
        {
            System.out.println("Divisible By 5 ");
        }
        else
        {
            System.out.println("Not Divisible By 5 ");
        }             
    }
}