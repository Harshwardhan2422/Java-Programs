import java.util.*;
import java.io.*;

class Program386
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter File Name That You won't to open");
            String Name = sobj.nextLine();
        
            File fobj = new File(Name);
        
            if(fobj.exists())
            {
                int iRet = 0;
                
                System.out.println("File Already Exists");
                
                FileInputStream fiobj = new FileInputStream(fobj);
                
                byte Arr[] = new byte[1024];
                
                while((iRet = fiobj.read(Arr)) != -1)
                {
                    String str = new String(Arr);
                    System.out.print(str);    
                }                
            }
        
            else
            {
                System.out.println("File Does not Exist");
            }
        }
        
        catch(Exception obj)
        {
            System.out.println("Exception Occurred");
        }
    }
}