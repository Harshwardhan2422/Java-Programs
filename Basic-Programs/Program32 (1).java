import java.util.Scanner;

class Program32
{
    public static void main(String A[])
    {
        int iFrequency = 0, iCnt = 0;
        
        System.out.println("Enter The Frequency : ");
        Scanner Sobj = new Scanner(System.in);
        iFrequency = Sobj.nextInt();
        
        for(iCnt = 1; iCnt <= iFrequency; iCnt++)
        {
            System.out.println(iCnt);
        }
        
    }
}