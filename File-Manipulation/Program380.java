import java.util.*;
import java.io.*;

class Program380
{
    public static void main(String A[])
    {
        try
        {
            boolean bRet = false;
            Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter File Name That You won't To Create");
            String Name = sobj.nextLine();
        
            File fobj = new File(Name);
        
            if(fobj.exists())
            {
                System.out.println("File Already Exists");
            }
        
            else
            {               
                bRet = fobj.createNewFile();
                
                if(bRet == true)
                {   
                    System.out.println("File Successfully Created");
                    
                FileOutputStream foobj = new FileOutputStream(fobj);
               
                String str = "Jay Ganesh";
                                
                byte arr[] = str.getBytes();
                foobj.write(arr);
                System.out.println("Bytes Written : "+arr.length);
                }
                
                else
                {
                    System.out.println("Enable To Create File");
                }
            }
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception Occurred");
        }
    }
}
