import java.util.Scanner;

class PatternDisplay 
{
    public int iRow, iCol;
    
    PatternDisplay(int iNo1, int iNo2)
    {
        iRow = iNo1;
        iCol = iNo2;
    }
    public void Display()
    {
        int i = 0, j = 0;
        
        if(iRow != iCol)
        {
            System.out.println("Invalid Input!");
            return;
        }
        
        for(i = 1; i <= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                if(j >= i)
                {
                    System.out.print("*\t\t");
                }
                else
                {
                    System.out.print("\t\t");
                }
            }
            System.out.println();
        }
    }
}
class Program171
{
    public static void main(String A[])
    {
        int iValue1 = 0, iValue2 = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter Number Of Rows : ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter Number Of Columns : ");
        iValue2 = sobj.nextInt();
        
        PatternDisplay obj = new PatternDisplay(iValue1, iValue2);
        obj.Display();
    }
}