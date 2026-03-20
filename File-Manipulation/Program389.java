import java.io.*;
import java.util.*;

class Program389
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter The Name of Directory that you won't to open");
        
        String DirName = sobj.nextLine();
        
        File fobj = new File(DirName);
        
        if(fobj.exists() && fobj.isDirectory())
        {
            System.out.println("Directory is Present");
        }
        else
        {
            System.out.println("There is no Such a Directory");
        }        
    }
}