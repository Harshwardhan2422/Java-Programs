import java.util.Scanner;

class Program67
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0};
        int iCnt = 0, iSum = 0;
        
        System.out.println("Please Entered the Values : ");
        Scanner sobj = new Scanner(System.in);
                
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        System.out.print("Addition is : "+iSum);        
      
    }
}