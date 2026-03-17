import java.util.Scanner;

class CountEven
{
    public int iSize;
    public int []Arr;
    
    CountEven(int iNo)
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
            if(Arr[iCnt] % 2 == 0)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program86
{
    public static void main(String A[])
    {
        int ilength = 0, iRet = 0;
        
        System.out.println("Enter Number Of Element : ");
        Scanner sobj = new Scanner(System.in);
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must be Greater than zero !");
            return;          
        }
        
        CountEven cobj = new CountEven(ilength);
        cobj.Accept(sobj);
        
        iRet = cobj.Display();
        System.out.println("Even Elements Are : "+iRet);        
    }
}