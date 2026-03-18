import java.util.Scanner;

class Minimum 
{
    public int iSize;
    public int []Arr;
    
    Minimum(int iNum)
    {
        iSize = iNum;
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int iCnt = 0;
        System.out.println("Please Enter the Elements : ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            Arr[iCnt] = obj.nextInt();
        }
    }
    
    public int DisplayMin()
    {
        int iCnt = 0, iMin = 0;
        iMin = Arr[0];
        
       for(iCnt = 0; iCnt < iSize; iCnt++)
       {
           if(Arr[iCnt] < iMin)
           {
               iMin = Arr[iCnt];
           }
       }
       return iMin;
    }
    
}

class Program112
{
    public static void main(String A[])
    {
        int ilength = 0, iRet = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Size Must Be Greater Than Zero!");
            return;
        }
        
        Minimum mobj = new Minimum(ilength);
        mobj.Accept(sobj);
        
       iRet =  mobj.DisplayMin();
       System.out.println("Minimum Number is : "+iRet);
        
    }
}
