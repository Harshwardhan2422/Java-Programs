import java.util.*;
import java.io.*;

class Program384
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
        
            System.out.println("Enter File Name ");
            String Name = sobj.nextLine();
        
            File fobj = new File(Name);
        
            if(fobj.exists())
            {
                int iRet = 0;
                System.out.println("File Already Exists");
                
                FileInputStream fiobj = new FileInputStream(fobj);
                
                byte Arr[] = new byte[(int)fobj.length()];
                
                iRet = fiobj.read(Arr);
                
                String str = new String(Arr, "UTF-8");
                
                System.out.println("Data From File : ");
                System.out.println(str);
                
                System.out.println("Return Value Of Read is : "+iRet);
                
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