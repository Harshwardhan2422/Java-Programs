import java.util.*;
import java.io.*;

class Program396
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Directory Name That You Won't To Open For Packing");
        
        String DirName = sobj.nextLine();
        
        File fobj = new File(DirName);
        
        if(!fobj.exists())
        {
            boolean bRet = false;
            
            if(bRet = fobj.mkdir())
            {
                System.out.println("Directory Successfully Opened");
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
            
            String header = "";
            
            for(int i = header.length(); i < 100; i++)
            {
                header = header + " ";
            }
            
            System.out.println("header Size is : "+header.length());
            System.out.println("header Size is : "+header.length());
            System.out.println("header Size is : "+header.length());
           
            String title =  String.format("%-69s %30s",
            "File Name", 
           " Size(Bytes)");
            System.out.println(title);
                        
            if(Arr != null)
            {                                 
                for(int i = 0; i < Arr.length; i++)
                {                    
                    String data = String.format("%-69s %30d",
                    Arr[i].getName(),
                    Arr[i].length());
                    
                    System.out.println(data);
                }
            }
            System.out.println(header);
       }
       
        else
        {
            System.out.println("Directory is not Present");
        }
    }
}