import java.util.Scanner;

class Maximum 
{
    public int iSize;
    public int []Arr;
    
    Maximum(int iNum)
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
    
    public int DisplayMax()
    {
        int iCnt = 0, iMax = 0;
        iMax = Arr[0];
        
       for(iCnt = 0; iCnt < iSize; iCnt++)
       {
           if(Arr[iCnt] > iMax)
           {
               iMax = Arr[iCnt];
           }
       }
       return iMax;
    }
    
}
class Program111
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
        
        Maximum mobj = new Maximum(ilength);
        mobj.Accept(sobj);
        
       iRet =  mobj.DisplayMax();
       System.out.println("Maximum Number is : "+iRet);
        
    }
}