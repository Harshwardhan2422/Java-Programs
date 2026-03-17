import java.util.Scanner;

class DisplayLess
{
    public int iSize;
    public int []Arr;
    
    DisplayLess(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int iCnt = 0;
        
        System.out.println("Please Enter the Values : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
    }
    
    public void Display()
    {
        int iCnt = 0;
        
        System.out.println("Element Less than 20 Are : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] < 20)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
    
}

class Program101
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must Be Greater Than Zero!");
            return;
        }
        
        DisplayLess dobj = new DisplayLess(ilength);
        dobj.Accept(sobj);
        dobj.Display();
    }
}