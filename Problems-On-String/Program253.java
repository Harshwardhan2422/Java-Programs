import java.util.Scanner;

class Ascending 
{
    public char ptr[];
    public int iSize;
    
    Ascending(char Brr[], int iNo)
    {
        ptr = Brr;
        iSize = iNo;
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        char temp = '\0';
        
        for(i = 0; i < iSize; i++)
        {
            for(j = i + 1; j < iSize; j++)
            {
                if(ptr[i] > ptr[j])
                {
                    temp = ptr[i];
                    ptr[i] = ptr[j];
                    ptr[j] = temp;
                }
            }
        }
    }    
}

class Program253
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0;
        
        System.out.print("Enter How Many Characters : ");
        iValue = sobj.nextInt();
        
        char Arr[] = new char[iValue];
        
        System.out.println("Enter The Characters : ");
        for(i = 0; i < iValue; i++)
        {
            Arr[i] = sobj.next().charAt(0);
        }
        
        Ascending aobj = new Ascending(Arr, iValue);
        aobj.Display();
        
        System.out.println("Ascending Order Is : ");
        for(i = 0; i < iValue; i++)
        {
            System.out.println(Arr[i]);
        }        
    }
}