import java.util.Scanner;

class Descending
{
    public int Arr[];
    public int iSize;
    
    Descending(int iNo)
    {
        iSize = iNo;      
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int i = 0;
        
        System.out.println("Enter The Elements : ");
        for(i = 0; i < iSize; i++)
        {
            Arr[i] = obj.nextInt();
        }
    }
    
    public void Display()
    {
        int i = 0, j = 0, temp = 0;
        
        for(i = 0; i < iSize; i++)
        {
            for(j = i + 1; j < iSize; j++)
            {
                if(Arr[i] < Arr[j])
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }        
        }      
        System.out.println("Descending Order Is : ");
        for(i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class Program256
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter How Many Elements : ");
        iValue = sobj.nextInt();
        
        Descending dobj = new Descending(iValue);
        dobj.Accept(sobj);
        dobj.Display();        
        
    }
}