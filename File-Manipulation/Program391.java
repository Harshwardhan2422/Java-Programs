import java.util.*;
import java.io.*;

class Program391
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Directory Name");
        
        String DirName = sobj.nextLine();
        
        File fobj = new File(DirName);
        
        if(!fobj.exists())
        {
            boolean bRet = false;
            
            if(bRet = fobj.mkdir())
            {
                System.out.println("Directory Created Successfully");
            }
            else
            {
                System.out.println("Unable to Create Directory");
            }
        }
        
        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is Present");
            
            File Arr[] = fobj.listFiles();
            
            System.out.println("File Inside Directory");
            
            for(int i = 0; i < Arr.length; i++)
            {
                System.out.println(Arr[i].getName());
            }
        }
        else
        {
            System.out.println("Directory is not Present");
        }
    }
}