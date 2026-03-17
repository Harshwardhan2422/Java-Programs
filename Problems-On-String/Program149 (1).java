import java.util.Scanner;

class PatternPrinter 
{
    public int iRow, iCol;
    
    PatternPrinter(int iNo1, int iNo2)
    {
        iRow = iNo1;
        iCol = iNo2;
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(i != j)
                {
                    System.out.print("*\t");
                }
                else
                {
                    System.out.print("&\t");
                }
            }
            System.out.println("");
        }
    }
}

class Program149
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;
        
        System.out.println("Enter Number Of Rows : ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter Number Of Columns : ");
        iValue2 = sobj.nextInt();
        
        PatternPrinter obj = new PatternPrinter(iValue1,iValue2);   
        obj.Display();
        
    }
}
