import java.util.*;

class Program412
{
    public static void BubbleSort(int Brr[])
    {
        int i = 0, j = 0, temp = 0;
        
        for(i = 0; i < Brr.length; i++)
        {
            for(j = 0; j < Brr.length - i - 1; j++)
            {
                if(Brr[j] > Brr[j + 1])
                {
                    temp = Brr[j];
                    Brr[j] = Brr[j + 1];
                    Brr[j + 1] = temp;
                }
            }
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
        
        BubbleSort(Arr);
        
        System.out.println("Values Of Array After  Sorting : ");
        
        for(i = 0; i < isize; i++)
        {
            System.out.print(Arr[i]+"\n");
        }
    }
}