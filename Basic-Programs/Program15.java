import java.util.Scanner;


class Program15
{
    public static void main(String A[])
    {
        float fPercentage = 0.0f;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter Your Percentage : ");
        fPercentage = Sc.nextFloat();
        
        if(fPercentage >= 35)
        {
            System.out.println("You Are Pass ");
        }
        else
        {
            System.out.println("You Are Fail ");
        }
        
    }
}