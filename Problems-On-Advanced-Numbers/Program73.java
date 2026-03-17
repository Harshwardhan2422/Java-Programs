import java.util.Scanner;

class DisplayResult
{
    public int ptr[];
    
    DisplayResult(int Brr[])
    {
        ptr = Brr;
    }
    void Display()
    {
        System.out.println("Values of Array Are : ");
        System.out.println(ptr[0]);
        System.out.println(ptr[1]);
        System.out.println(ptr[2]);
        System.out.println(ptr[3]);
    }
}

class Program73
{
    public static void main(String A[])
    {
        int Arr[] = {0,0,0,0};
        int iCnt = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Entered the Values : ");
        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }
        
        DisplayResult dobj = new DisplayResult(Arr);
        dobj.Display();
        
    }
}