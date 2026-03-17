import java.util.Scanner;

class AdditionOdd 
{
    public int iSize;
    public int []Arr;
    
    AdditionOdd(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int iCnt = 0;
        
        System.out.println("Please Enter values : ");
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
    }
    
    public int Display()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iSum = iSum + Arr[iCnt];
            }
        }
        return iSum;
    }
}

class Program89
{
    public static void main(String A[])
    {
        int ilength = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must be Greater than zero!");
            return;
        }
        
        AdditionOdd  aobj = new AdditionOdd(ilength);
        aobj.Accept(sobj);
        
        iRet = aobj.Display();
        System.out.println("Addition is : "+iRet);
        
    }
}