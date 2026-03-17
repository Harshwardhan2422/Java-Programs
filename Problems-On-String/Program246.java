import java.util.Scanner;

class ReverseArray 
{
    public int str[];
    public int iSize;
    
    ReverseArray(int Brr[], int iNo)
    {
        str = Brr;
        iSize = iNo;
    }
    
    public void Display()
    {
        int i = 0, iStart = 0, iEnd = 0, temp = 0;
        
        iEnd = iSize - 1;
          
        while(iStart < iEnd)
        {
            temp = str[iStart];
            str[iStart] = str[iEnd];
            str[iEnd] = temp;
            
            iStart++;
            iEnd--;
        }
    }
}

class Program246
{
    public static void main(String A[])
    {
        int iValue = 0, i = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter How many Elements : ");
        iValue = sobj.nextInt();
                
        int Arr[] = new int[iValue];
        
        System.out.println("Enter The Elements : ");
        for(i = 0; i < iValue; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        ReverseArray obj = new ReverseArray(Arr, iValue);
        obj.Display();
        
        System.out.println("Reverse Elements Are : ");
        for(i = 0; i < iValue; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}