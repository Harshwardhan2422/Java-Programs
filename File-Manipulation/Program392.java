import java.util.*;
import java.io.*;

class Program392
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
           
            String header =  String.format("%-15s %10s",
            "File Name", 
           " Size(Bytes)");
            System.out.println(header);
                        
            if(Arr != null)
            {                                 
                for(int i = 0; i < Arr.length; i++)
                {                    
                    String data = String.format("%-15s %10d",
                    Arr[i].getName(),
                    Arr[i].length());
                    
                    System.out.println(data);
                }
            }
       }
       
        else
        {
            System.out.println("Directory is not Present");
        }
    }
}