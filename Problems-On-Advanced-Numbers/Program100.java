import java.util.Scanner;

class Average 
{
    public int iSize;
    public int []Arr;
    
    Average(int iNo)
    {
        iSize = iNo;
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
    }
    
    public float Display()
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            iSum = iSum + Arr[iCnt];
        }
        return (float) iSum / iSize;
    }
}

class Program100
{
    public static void main(String A[])
    {
        int ilength = 0;
        float fRet = 0.0f;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Invalid Size! Size must be Greater than zero ");
            return;
        }
        
        Average aobj = new Average(ilength);       
        aobj.Accept(sobj);
        
        fRet = aobj.Display();
        System.out.println("Average is : "+fRet);
                
    }
}