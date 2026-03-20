import java.util.*;

class Matrix 
{
    public int Arr[][];
    
    public Matrix(int iRow, int iCol)
    {
        Arr = new int[iRow][iCol];
    }
    
    public void Accept()
    {
        System.out.println("Please Enter The Values : ");
        Scanner sobj = new Scanner(System.in);
        
        int i = 0, j = 0;
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }
    }
    
    public void Display()
    {
        int i = 0, j = 0;
        
        System.out.println("Elements Of Matrix Are : ");
        
        for(i = 0; i < Arr.length; i++)
        {
            for(j = 0; j < Arr[i].length; j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }        
    }
}

class Program442
{
    public static void main(String A[])
    {  
        Matrix mobj = new Matrix(4,3);
        
        mobj.Accept();
        mobj.Display();
    }
}