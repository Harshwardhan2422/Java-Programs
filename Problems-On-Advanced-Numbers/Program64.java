import java.util.Scanner;

class Program64
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[] = {0,0,0,0};
        int iCnt = 0;
        
        System.out.println("Please Entered the Values : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Values from Array Are : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}