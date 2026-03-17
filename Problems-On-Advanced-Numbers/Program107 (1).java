import java.util.Scanner;

class CountGreat
{
    public int iSize;
    public int []Arr;
    
    CountGreat(int iNum)
    {
        iSize = iNum;
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
    
    public int Display(int iNo)
    {
        int iCnt = 0, iCount = 0;
        System.out.println("Element Greater than "+iNo+" is : ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iNo)
            {
                iCount++;
            }
        }
        return iCount;
    }
}

class Program107
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0, iRet = 0;       
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Invalid Size! Size must be Greater than zero");
            return;
        }
        
        CountGreat cobj =  new CountGreat(ilength);
        cobj.Accept(sobj);
        
        System.out.println("Enter Element To Compare :");
        iValue = sobj.nextInt();
        
        iRet = cobj.Display(iValue);        
        System.out.println("Element Greater Than "+iValue+" is : "+iRet);
       
    }
}
