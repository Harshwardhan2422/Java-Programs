import java.util.Scanner;

class Demo 
{
    public void Display()
    {
        Scanner sobj = new Scanner(System.in);
        
        int Arr[] = {0,0,0,0,0};
        int iCnt = 0;
        
        System.out.println("Please Entered the Values : ");
        
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }        
    }
}

class Program65
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();
        
    }
}