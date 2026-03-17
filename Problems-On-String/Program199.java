import java.util.Scanner;

class Program199
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        String Arr;
        int ptr = 0;
        
        System.out.println("Enter String : ");
        Arr = sobj.nextLine();
        
        while(ptr < Arr.length())
        {
            System.out.println(Arr.charAt(ptr));
            ptr++;
        }
        sobj.close();
    }
}