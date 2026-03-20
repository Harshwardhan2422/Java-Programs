import java.util.*;
import java.io.*;

class Program398
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
        
        if(!fobj.exists() || !fobj.isDirectory())
        {
            System.out.println("Directory is not Present");
            return;
        }     
        
        File Arr[] = fobj.listFiles();
        
        FileOutputStream fos = new FileOutputStream(pobj);
        
        if(Arr != null)
        {
            for(int i = 0; i < Arr.length; i++)
            {
                if(Arr[i].isFile())
                {
                    String header = Arr[i].getName() + " " + Arr[i].length() + "\n";
                    fos.write(header.getBytes());
                    
                    FileInputStream fis = new FileInputStream(Arr[i]);
                    byte buffer[] = new byte[1024];
                    int byteRead = 0;
                    
                    while((byteRead = fis.read(buffer)) != -1)
                    {
                        fos.write(buffer, 0, byteRead);
                    }
                                       
                    fis.close();
                }
            }
        }
        fos.close();
        
        System.out.println("Packing Created Successfully");
    }
}