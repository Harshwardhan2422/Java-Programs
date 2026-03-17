import java.util.Scanner;

class Frequency 
{
    public int iSize;
    public int []Arr;
    
    Frequency(int iNo)
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
    
    public int Display(Scanner obj)
    {
        int iCnt = 0, iFrequency = 0, iNum = 0;
        
        System.out.println("Enter the Frequency : ");
        iNum = obj.nextInt();
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNum)
            {
                iFrequency++;
            }
        }
        return iFrequency;
    }
}

class Program93
{
    public static void main(String A[])
    {
        int ilength = 0, iRet  = 0;
        
        System.out.println("Enter Number Of Element : ");
        Scanner sobj = new Scanner(System.in);
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("size must be Greater than zero!");
            return;
        }
        
        Frequency fobj = new Frequency(ilength);
        fobj.Accept(sobj);
              
        iRet = fobj.Display(sobj);
        System.out.println("Frequency is : "+iRet);       
        
    }
}

