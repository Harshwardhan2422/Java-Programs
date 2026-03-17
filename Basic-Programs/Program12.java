import java.util.Scanner;

class Program12
{
    public static void main(String A[])
    {
        float fRadius = 0.0f, fResult = 0.0f;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Radius of Circle : ");
        fRadius = sc.nextFloat();
        
        fResult = 3.14f * fRadius  * fRadius;
        System.out.println("Area of Circle is : "+fResult);
    }
}
