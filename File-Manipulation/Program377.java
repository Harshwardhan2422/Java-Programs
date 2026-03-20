import java.io.*;
import java.util.*;

class Program377
{
    public static void main(String A[])
    {
        try
        {
            boolean bRet = false;
            Scanner sobj = new Scanner(System.in);
            
            System.out.println("Enter File Name That You wont To Create");
            
            String Name = sobj.nextLine();
            
            File fobj = new File(Name);
            
            if(fobj.exists())
            {
                System.out.println("File is Already Exiting  in Folder");
                
            }
            
            else
            {
                bRet = fobj.createNewFile();
            
                if(bRet == true)
                {
                    System.out.println("File Successfully Created");
                }
            
                else
                {
                    System.out.println("Enable To Create File");
                }
            }
         }
        
            catch(Exception eobj)
            {           
                System.out.println("Exception Occurred");
            }
      }
}
