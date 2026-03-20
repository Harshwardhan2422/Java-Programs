import java.util.*;

class Program409
{
    public static boolean LinearSearch(int Brr[], int  iNo)
    {
        int i= 0;
        
        for(i = 0; i < Brr.length; i++)
        {
            if(Brr[i] == iNo )
            {
                return true;
            }            
        } 
        return false;
    }
    
    public static void main(String A[])
    {        
        int isize = 0, i = 0, ivalue = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Number Of Elements : ");
        isize = sobj.nextInt();
        
        int Arr[] = new int[isize];
        
        System.out.println("Enter The Values");
        
        for(i = 0; i < isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter The Element That You Won't To Search : ");
        ivalue = sobj.nextInt();
        
        bRet = LinearSearch(Arr, ivalue);
        
        System.out.println("Values Of Array Are : ");
         
         for(i = 0; i < isize; i++)
         {
             System.out.print(Arr[i]+"\t");
             System.out.println();
         }
         
         if(bRet == true)
         {
             System.out.println("Element is Present in Array");
         }
         
         else
         {
             System.out.println("There  is no Such Element in Array");
         }
    }
}