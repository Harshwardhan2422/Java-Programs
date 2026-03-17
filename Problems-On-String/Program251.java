import java.util.Scanner;

class Ascending 
{
    public int str[];
    public int iSize;
    
    Ascending(int Brr[], int iNo)
    {
        str = Brr;
        iSize = iNo;
    }
    
    public void Display()
    {
        int i = 0, j = 0, temp = 0;
        
        for(i = 0; i < iSize; i++)
        {
            for(j = i + 1; j < iSize; j++)
            {
                if(str[i] > str[j])
                {
                    temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }
    }
}

class Program251
{
    public static void main(String A[])
    {
        int iValue = 0, i = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter How Many Elements : ");
        iValue = sobj.nextInt();
        
        int Arr[] = new int[iValue];
        
        System.out.println("Enter The Elements : ");
        for(i = 0; i < iValue; i++)
        {
            Arr[i] = sobj.nextInt();
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