import java.util.Scanner;

class Demo
{
    public int ptr[];
    
    Demo(int Brr[])
    {
        ptr = Brr;
    }
    void Display()
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            System.out.println(ptr[iCnt]);
        }
    }
}

class Program72
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0,};
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Values : ");
        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        Demo obj = new Demo(Arr);
        obj.Display();
    }
}