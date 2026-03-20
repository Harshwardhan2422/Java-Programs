import java.util.*;

class Program407
{
    public static void Update(int Brr[])
    {
        Brr[0]++;
    }
    
    public static void main(String A[])
    {        
        int isize = 0, i = 0;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements : ");
        isize = sobj.nextInt();
        
        int Arr[] = new int[isize];
        
        System.out.println("Enter The Values");
        
        for(i = 0; i < isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        Update(Arr);
        
        System.out.println("Values Of Array Are : ");
         
         for(i = 0; i < isize; i++)
         {
             System.out.print(Arr[i]+"\t");
         }
    }
}