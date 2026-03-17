import java.util.Scanner;

class Frequency 
{
    public int iSize;
    public int iDigit;
    public int []Arr;
    
    Frequency(int iNo, int iNum)
    {
        iSize = iNo;
        iDigit = iNum;
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
        int iCnt = 0, iFrequency = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iDigit)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class Program92
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        System.out.println("Enter The Frequency: ");
        iValue = sobj.nextInt();
        
        Frequency fobj = new Frequency(ilength, iValue);
        fobj.Accept(sobj);
        
        iRet = fobj.Display();
        System.out.println("Frequency is : "+iRet);
              
    }
}