import java.util.Scanner;

class Program39
{
    public static void main(String A[])
    {
        int iFrequency = 0, iCnt = 0;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter The Frequency : ");
        iFrequency = Sobj.nextInt();
        
        for(iCnt = iFrequency; iCnt >= 1; iCnt--)
        {
            System.out.println(iCnt);
        }
    }
}