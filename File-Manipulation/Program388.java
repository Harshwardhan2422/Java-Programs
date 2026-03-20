import java.util.*;
import java.io.*;

class Program388
{
    public static void main(String A[]) throws Exception 
    {
        Scanner sobj = new Scanner(System.in);        
        System.out.println("Enter The Name of Source File");
        String src = sobj.nextLine();
        
        System.out.println("Enter The Name of Destination File");
        String dest = sobj.nextLine();
        
        File fsrc = new File(src);
        File fdest = new File(dest);
        
        if(!fsrc. exists())
        {
            System.out.println("Source File Is Missing");
            return;
        }
        
        if(fdest.exists())
        {
            System.out.println("Destination File is Already Present");
            return;
        }
        
        else
        {
            fdest.createNewFile();
            
            FileInputStream fiobj = new FileInputStream(fsrc);
            FileOutputStream  fobj = new FileOutputStream(fdest);
            
            int iRet = 0;
            
            byte Arr[] = new byte[1024];
            
            while((iRet = fiobj.read(Arr)) != -1)
            {
                fobj.write(Arr, 0, iRet);
            }
            
            System.out.println("File Successfully Copied");
        }
    }
}