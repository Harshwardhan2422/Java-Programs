import java.io.*;

class Program374
{
    public static void main(String A[])
    {
        try
        {
            boolean bRet = false;
            
            File fobj = new File("Demo.txt");
            
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
            System.out.printf("Exception Occurred");
        }
    }
}