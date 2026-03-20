import java.util.*;

class Program416
{
    public static void InsertionSort(int Brr[])
    {
        int i = 0, j = 0, k = 0;
        int selected = 0;
        
        for(i = 0; i < Brr.length; i++)
        {
            for(j = i - 1, selected = Brr[i] ; ((j >= 0) && (Brr[j] > selected )); j--)
            {
                Brr[j + 1] = Brr[j];                
            }
            
            Brr[j + 1] = selected;
        }
    }
    
    public static void main(String A[])
    {
        int isize = 0, i = 0;
        
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter Number Of Element : ");
        isize = sobj.nextInt();
        
        int Arr[] = new int[isize];
        
        System.out.println("Enter The Values : ");
        
        for(i = 0; i < isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Elements Of Array Are : ");
        
        for(i = 0; i < isize; i++)
        {
            System.out.print(Arr[i]+"\t");
        }
        System.out.println();
        
        InsertionSort(Arr);
        
        System.out.println("Element Of Array After  Sorting : ");
        
        for(i = 0; i < isize; i++)
        {
            System.out.print(Arr[i]+"\t ");
        }
        System.out.println();
    }
}
