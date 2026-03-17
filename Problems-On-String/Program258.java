import java.util.Scanner;

class Ascending 
{
    public int iSize;
    public char Arr[];
    
    Ascending(int iNo)
    {
        iSize = iNo;
        Arr = new char[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int i = 0;
        
        System.out.println("Enter The Characters : ");
        for(i = 0; i < iSize; i++)
        {
            Arr[i] = obj.next().charAt(0);
        }
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        char temp = '\0';
        
        for(i = 0; i < iSize; i++)
        {
            for(j = i + 1; j < iSize; j++)
            {
                if(Arr[i] > Arr[j])
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }               
            }
        }
        System.out.println("Ascending Order Is : ");
        for(i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    } 
}

class Program258
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter How Many Characters : ");
        iValue = sobj.nextInt();
        
        Ascending aobj = new Ascending(iValue);
        aobj.Accept(sobj);
        aobj.Display();
        
    }
}