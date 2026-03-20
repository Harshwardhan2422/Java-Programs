import java.util.*;

class Program411
{
    public static boolean BinarySearch(int Brr[], int iNo)
    {
        int istart = 0, imid = 0, iend = Brr.length - 1;
        boolean bresult = false;
        
        while(istart <= iend)
        {
            imid = istart + (iend - istart) / 2;
            
            if(Brr[imid] == iNo)
            {
                bresult = true;
                break;
            }
            
            if(iNo > Brr[imid])
            {
                istart = imid + 1;
            }
            
            else
            {
                iend = imid - 1;
            }        
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
        
        bRet = BinarySearch(Arr, ivalue);
        
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