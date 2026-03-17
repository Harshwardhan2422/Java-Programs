import java.util.Scanner;

class DisplayResult 
{
    public int ptr[];
    public int iSize;
    
    DisplayResult(int Brr[],int iNo)
    {
        ptr = Brr;
        iSize = iNo;
    }
    
    public void Display()
    {
        int iCnt = 0;
        
        System.out.println("Values of Array Are : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            System.out.println(ptr[iCnt]);
        }
    }
}

class Program74
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0};
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Entered the Values : ");
        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        DisplayResult dobj = new DisplayResult(Arr,4);
        dobj.Display();
    }
}