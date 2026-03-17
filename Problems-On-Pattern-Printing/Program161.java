import java.util.Scanner;

class PatternPrinter 
{
    public int iRow, iCol = 0;
    
    PatternPrinter(int iNum1, int iNum2)
    {
        iRow = iNum1;
        iCol = iNum2;
    }
    public void Display()
    {
        int i = 0, j = 0;
        char ch = 'a';
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.printf("%4c\t",ch);
                ch++;
            }
            System.out.println("");
        }        
    }        
}

class Program161
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;
        
        System.out.println("Enter Number Of Rows :");
        iValue1 = sobj.nextInt();
        System.out.println("Enter Number Of Columns : ");
        iValue2 = sobj.nextInt();
        
        PatternPrinter obj = new PatternPrinter(iValue1,iValue2);
        obj.Display();        
    }
}