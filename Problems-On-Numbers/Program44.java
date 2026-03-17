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
        return(iNo % 5 == 0);
    }
}

class Program44
{
    public static void main(String A[])
    {
        int iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter Number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        Demo obj = new Demo(iValue);
        bRet = obj.DisplayFactors();
        
        if(bRet == true)
        {
            System.out.println("Divisible By 5");
        }
        else
        {
            System.out.println("Not Divisible By 5");
        }     
    }
}