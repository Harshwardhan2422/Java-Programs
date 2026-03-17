import java.util.Scanner;

class Recursion 
{
    int ptr[];
    int iSize;
    static int i = 0;
    
    Recursion(int iNo)
    {
        iSize = iNo;
        ptr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int i = 0;
        
        System.out.println("Enter The Elements : ");
        for(i = 0; i < iSize; i++)
        {
            ptr[i] = obj.nextInt();
        }
    }
    
    public void DisplayR()
    {
        if(i < iSize)
        {
            System.out.println(ptr[i]);
            i++;
            DisplayR();
        }
    }
}

class Program291
{
    public static void main(String A[])
    {
        int iValue = 0;
        
        System.out.println("Enter The Number : ");
        Scanner sobj = new Scanner(System.in);
        iValue = sobj.nextInt();
        
        Recursion robj = new Recursion(iValue);
        
        robj.Accept(sobj);
        robj.DisplayR();
    }
}