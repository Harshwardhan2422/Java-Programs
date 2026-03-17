
import java.util.Scanner;

class Search 
{
    public int iSize;
    public int []Arr;
    
    Search(int iNo)
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
    
    public boolean Display(int iNum)
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] == iNum)
            {
                return true;
            }
        }
        return false;
    } 
}

class Program97
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0;
        boolean bRet = false;
        
        System.out.println("Enter Number Of Element : ");
        Scanner sc = new Scanner(System.in);
        ilength = sc.nextInt();
        
        Search sobj = new Search(ilength);
        sobj.Accept(sc);
        
        System.out.println("Enter the Frequency : ");
        iValue = sc.nextInt();
              
        bRet =sobj.Display(iValue);
        
        if(bRet == true)
        {
            System.out.println("Element is present ");
        }
        else
        {
            System.out.println("Element is not present ");
        }     
    }
}
