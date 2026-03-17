import java.util.Scanner;

class Demo
{
    public int Brr[];
    public int iNo;
    
    Demo(int A[],int iValue)
    {
        Brr = A;
        iNo = iValue;
    }
    
    public void Accept()
    {
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Please Entered the Values : ");
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            Brr[iCnt] = sobj.nextInt();
        }
    }
    
    public void Display()
    {
        int iCnt = 0;
        
        System.out.println("Values from Array Are : ");
        
        for(iCnt = 0; iCnt < Brr.length; iCnt++)
        {
            System.out.println(Brr[iCnt]);
        }
    }
}

class Program66
{
    public static void main(String A[])
    {
        int iSize = 0;
        
        System.out.println("Enter Number : \n");
        Scanner sobj = new Scanner(System.in);
        iSize = sobj.nextInt();
        
        int Arr[] = new int[iSize];
        
        Demo dobj = new Demo(Arr,iSize);
        dobj.Accept();
        dobj.Display();
        
    }
}