import java.util.Scanner;

class GreaterDisplay 
{
    public int iSize;
    public int []Arr;
    
    GreaterDisplay(int iNum)
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
    
    public void Display(int iNo)
    {
        int iCnt = 0;
        System.out.println("Element Greater than "+iNo+" is : ");
        
        for(iCnt = 0; iCnt < iSize; iCnt++)
        {
            if(Arr[iCnt] > iNo)
            {
                System.out.println(Arr[iCnt]);
            }
        }
    }
}

class Program106
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0;       
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Element : ");
        ilength = sobj.nextInt();
        
        if(ilength <= 0)
        {
            System.out.println("Invalid Size! Size must be Greater than zero");
            return;
        }
        
        GreaterDisplay gobj =  new GreaterDisplay (ilength);
        gobj.Accept(sobj);
        
        System.out.println("Enter Element To Compare :");
        iValue = sobj.nextInt();
        
        gobj.Display(iValue);        
       
    }
}
