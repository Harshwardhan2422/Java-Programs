import java.util.Scanner;

class Program75
{
    public static void main(String A[])
    {
        int ilength = 0,iCnt = 0;
        int Arr[];
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number of Element : ");
        ilength = sobj.nextInt();
        
        Arr = new int[ilength];
        
        System.out.println("Entered the Values : ");
        for(iCnt = 0; iCnt < ilength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
    }
}