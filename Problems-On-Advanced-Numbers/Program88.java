import java.util.Scanner;

class CountOdd 
{
    public int iSize;
    int []Arr;
    
    CountOdd(int iNo)
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
    
    public int Display()
    {
        int iCnt = 0, iCount = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] % 2 != 0)
            {
                iCount++;
            }
        }
        return iCount;
    }  
}

class Program88
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must be Greater than zero!");
            return;
        }
        
        CountOdd cobj = new CountOdd(ilength);
        cobj.Accept(sobj);
        
        iRet = cobj.Display();
        System.out.println("Odd Elements Are : "+iRet);
    }
}