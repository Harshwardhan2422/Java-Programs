import java.util.Scanner;

class Program36
{
    public static void main(String A[])
    {
        Scanner Sobj = new Scanner(System.in);
        
        int iFrequency = 0, iCnt = 0;
        iCnt = 1;
        
        System.out.println("Enter The Frequency : ");
        iFrequency = Sobj.nextInt();
        
        while(iCnt <= iFrequency)
        {
            System.out.println("\n Java \n");
            iCnt++;
        }       
    }
}