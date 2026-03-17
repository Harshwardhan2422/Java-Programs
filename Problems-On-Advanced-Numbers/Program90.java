import java.util.Scanner;

class AdditionEvenOdd 
{
    public int iSize;
    public int []Arr;
    
    AdditionEvenOdd(int iNo)
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
        int iCnt = 0, iEven = 0, iOdd = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 == 0)
            {
                iEven = iEven + Arr[iCnt];
            }
            else
            {
                iOdd = iOdd + Arr[iCnt];
            }
        }
        System.out.println("Addition Of Even Elements Are : "+iEven);
        System.out.println("Addition Of Odd Elements Are : "+iOdd);
    }
}

class Program90
{
    public static void main(String A[])
    {
        int ilength = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must be Greater than zero!");
            return;
        }
        
        AdditionEvenOdd aobj = new AdditionEvenOdd(ilength);
        aobj.Accept(sobj);
        aobj.Display();
        
    }
}