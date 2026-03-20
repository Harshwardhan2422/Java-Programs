import java.io.*;

class Program373
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Demo.txt");
            
            fobj.createNewFile();
        }
        
        catch(Exception eobj)
        {           
            System.out.printf("exception Occurred");
        }
    }
}