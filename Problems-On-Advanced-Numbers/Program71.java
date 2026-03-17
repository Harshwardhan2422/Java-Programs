import java.util.Scanner;

class Program71
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0,};
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the Values");   
        for(iCnt = 0; iCnt < 4;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        System.out.println("Values of Array Are :");
        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }       
    }
}