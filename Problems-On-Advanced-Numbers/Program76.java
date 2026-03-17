import java.util.Scanner;

class Program76
{
    public static void main(String A[])
    {
        int ilength = 0, iCnt = 0;
        int Arr[];
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        Arr = new int[ilength];
        
        System.out.println("Please Entered the Values : ");
        for(iCnt = 0; iCnt < ilength; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Values of Array Are : ");
        for(iCnt = 0; iCnt < ilength;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}