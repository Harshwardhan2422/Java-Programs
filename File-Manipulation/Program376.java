import java.io.*;
import java.util.*;

class Program376
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
        
        catch(Exception eobj)
        {           
            System.out.println("Exception Occurred");
        }
    }
}
