import java.util.Scanner;

class DisplayFrequency 
{
    public int iRow, iCol;
    
    DisplayFrequency(int iNo1, int iNo2)
    {
        iRow = iNo1;
        iCol = iNo2;
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        
        for(i= 1; i<= iRow; i++)
        {
            for(j = 1; j <= iCol; j++)
            {
                System.out.printf("%4d",i);
            }
            System.out.println("");
        }
    }    
}

class Program141
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue1 = 0, iValue2 = 0;
        
        System.out.println("Enter Number Of Rows : ");
        iValue1 = sobj.nextInt();
        System.out.println("Enter Number Of Columns : ");
        iValue2 = sobj.nextInt();
        
        DisplayFrequency dobj = new DisplayFrequency(iValue1,iValue2);   
        dobj.Display();
        
    }
}