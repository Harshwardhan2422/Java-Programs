import java.util.*;

class Program415
{
    public static void SelectionSort(int Brr[])
    {
        int i = 0, j = 0, min_index = 0, temp = 0;
        
        for(i = 0; i < Brr.length - 1; i++)
        {
            min_index = i;
            
            for(j = i + 1; j < Brr.length; j++)
            {
                if(Brr[min_index] > Brr[j])
                {
                    min_index = j;
                }
            }
            
            temp = Brr[i];
            Brr[i] = Brr[min_index];
            Brr[min_index] = temp;
            
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
        
        SelectionSort(Arr);
        
        System.out.println("Values Of Array After  Sorting : ");
        
        for(i = 0; i < isize; i++)
        {
            System.out.print(Arr[i]+" ");
        }
    }
}
