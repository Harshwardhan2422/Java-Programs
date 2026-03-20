import java.util.*;

class Program410
{
    public static boolean LinearSearchByDirectional(int Brr[], int iNo)
    {
        boolean bresult = false;
        int istart = 0;
        int iend = Brr.length - 1;
        
        while(istart <= iend)
        {
            if((Brr[istart] == iNo) || (Brr[iend] == iNo))
            {
                bresult = true;
                break;
            }
            istart++;
            iend--;
        }
        return bresult;
    }
    
    public static void main(String A[])
    {
        int isize = 0, ivalue = 0, i = 0;
        boolean bRet = false;
        
        Scanner sobj = new Scanner (System.in);
        System.out.println("Enter Number Of Element : ");
        isize = sobj.nextInt();
        
        int Arr[] = new int[isize];
        
        System.out.println("Enter The Values : ");
        
        for(i = 0; i < isize; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        System.out.println("Enter Element That You Won't To Search");
        ivalue = sobj.nextInt();
        
        bRet = LinearSearchByDirectional(Arr, ivalue);
        
        System.out.println("Values Of Array Are : ");
        
        for(i = 0; i < isize; i++)
        {
            System.out.print(Arr[i]+"\n");
        }
        
        if(bRet == true)
        {
            System.out.println("\nElement is Present");
        }
        
        else
        {
            System.out.println("\nThere is no Such Element");
        }
    }
}