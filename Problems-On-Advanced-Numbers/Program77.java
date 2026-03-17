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

class Program77
{
    public static void main(String A[])
    {
        int Arr[];
        int ilength = 0, iCnt = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Number of Element : ");
        ilength = sc.nextInt();
        
        Arr = new int[ilength];
        
        System.out.println("Please Entered the Values : ");
        for(iCnt = 0; iCnt < ilength; iCnt++)
        {
            Arr[iCnt] = sc.nextInt();
        }
        
        DisplayResult dobj = new DisplayResult(Arr, ilength);
        dobj.Display();
        
    }
}