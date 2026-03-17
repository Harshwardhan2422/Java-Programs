import java.util.Scanner;

class Demo
{
    public int Brr[];
    
    Demo(int A[])
    {
        Brr = A;
    }
    
    int Display()
    {
        int iSum = 0, iCnt = 0;
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            iSum = iSum + Brr[iCnt];
        }
        return iSum;
    }
    
}
class Program68
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0};
        int iRet = 0, iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please Entered the Values : ");
              
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Demo dobj = new Demo(Arr);
        iRet = dobj.Display();
        
        System.out.println("Addition is : "+iRet);
              
    }
}