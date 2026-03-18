import java.util.Scanner;

class AdditionGreat
{
    public int iSize;
    public int []Arr;

    AdditionGreat(int iNo)  
    {  
        iSize = iNo;  
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
  
    public int DisplayResult(int iNo)
    {
        int iCnt = 0, iSum = 0;
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iNo)
            {
                iSum = iSum + Arr[iCnt];
            }
        }
        return iSum;
    }
}

class Program119
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0, iRet = 0;

        System.out.println("Enter Number Of Element : ");  
        Scanner sobj = new Scanner(System.in);  
        ilength = sobj.nextInt();  
      
        if(ilength <= 0)  
        {  
            System.out.println("Size Must Be Greater Than Zero!");  
            return;  
        }  
      
       AdditionGreat aobj = new AdditionGreat(ilength);
       aobj.Accept(sobj);
        
        System.out.println("Enter Number To Compare : ");  
        iValue = sobj.nextInt();  
        
        iRet = aobj.DisplayResult(iValue);
        System.out.println("Sum Of Number Greater Than "+iValue+" is : "+iRet);
         
    }
}

