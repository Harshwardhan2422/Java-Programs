import java.util.Scanner;

class Program3
{
    public static void main(String A[])
    {
        int iNo1 = 0;
        int iNo2 = 0;
        int iAns = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();
        
        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();
        
        iAns = iNo1 + iNo2;
        
        System.out.println("Addition is : "+iAns);
    }
}