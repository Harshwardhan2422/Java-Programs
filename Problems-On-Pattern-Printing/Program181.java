import java.util.Scanner;

class PatternDisplay 
{
    public int iRow , iCol;
    
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
                if((i == 1 && j == 3)||
                   (i == 3 && j == 1)||
                   (i == 3 && j == 5)||
                   (i == 5 && j == 3))
                   {
                       System.out.print("*\t");
                   }
                   else if(i == 3 && j == 3)
                   {
                       System.out.print("$\t");
                   }
                   else
                   {
                       System.out.print("\t");
                   }
            }
            System.out.println();
        }
    }
}

class Program181
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        int iValue1 = 0, iValue2 = 0;
        
        System.out.println("Enter Number Of Rows : ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter Number Of Columns : ");
        iValue2 = sobj.nextInt();
        
        PatternDisplay obj = new PatternDisplay(iValue1, iValue2);
        obj.Display();
        
    }
}