import java.util.*;
import java.io.*;

class Program397
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter The Directory That You Won't To Open");
        String DirName = sobj.nextLine();
        
        System.out.println("Enter The Name of Packed File That You Won't To Create");        
        String PackName = sobj. nextLine();
        
        File fobj = new File(DirName);
        File pobj = new File(PackName);
        
        if(!fobj.exists())
        {
            System.out.println("Directory is not Present");
            return;
        }     
        
        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is Present");
            
            File Arr[] = fobj.listFiles();
            
            FileOutputStream fos = new FileOutputStream(pobj);
            
            String header = "";
            
            for(int i = 0; i < 100; i++)
            {
                header = header + " ";
            }
            fos.write(header.getBytes());
            
            if(Arr != null)
            {
                for(int i = 0; i < Arr.length; i++)
                {
                    String data = Arr[i].getName() + " " + Arr[i].length() + "\n";
                    fos.write(data.getBytes());
                }
            }
            
            fos.close();
            System.out.println("Packing Created Successfully");
        }
        
        else
        {
            System.out.println("Directory is not Present");
        }
  
    }
}