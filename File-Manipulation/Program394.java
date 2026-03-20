import java.util.*;
import java.io.*;

class Program394
{
    public static void main(String A[])
    {
        String header = "            ";
        System.out.println("header length is: "+header.length());
        
        for(int i = header.length(); i < 100; i++)
        {
            header = header + " ";            
        }
        System.out.println("Updated header is : "+header.length());
    }     
}