import java.util.Scanner;

class DisplayLess
{
    public int iSize;
    public int []Arr;

    DisplayLess(int iNo)  
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
  
    public void Display(int iNo)  
    {  
        int iCnt = 0;  
      
        System.out.println("Element Less Than "+iNo+" Are : ");  
        for(iCnt = 0; iCnt < iSize; iCnt++)  
        {  
            if(Arr[iCnt] < iNo)  
            {  
                System.out.println(Arr[iCnt]);  
            }  
        }  
    }
}

class Program118
{
    public static void main(String A[])
    {
        int ilength = 0, iValue = 0;

        System.out.println("Enter Number Of Element : ");  
        Scanner sobj = new Scanner(System.in);  
        ilength = sobj.nextInt();  
      
        if(ilength <= 0)  
        {  
            System.out.println("Size Must Be Greater Than Zero!");  
            return;  
        }  
      
        DisplayLess dobj = new DisplayLess(ilength);  
        dobj.Accept(sobj);  
      
        System.out.println("Enter Number To Compare : ");  
        iValue = sobj.nextInt();  
      
        dobj.Display(iValue);        
    }
}

