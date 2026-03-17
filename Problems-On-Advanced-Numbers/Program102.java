import java.util.Scanner;

class DisplayGreater
{
    public int iSize;
    public int []Arr;
    
    DisplayGreater(int iNo)
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
        
        System.out.println("Element Greater than 20 Are : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > 20)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
    
}

class Program102
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
        
        DisplayGreater dobj = new DisplayGreater(ilength);
        dobj.Accept(sobj);
        dobj.Display();
    }
}
