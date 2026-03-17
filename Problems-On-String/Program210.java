
import java.util.Scanner;

class CountVowels
{
    public String Str;
    
   CountVowels(String ptr)
    {
        Str = ptr;
    }
    
    int Display()
    {
        int iCount = 0;
        int i = 0;
        
        while(i < Str.length())
        {
            if((Str.charAt(i) == 'A')||
                (Str.charAt(i) == 'E')||
                (Str.charAt(i) == 'I')||
                (Str.charAt(i) == 'O')||
                (Str.charAt(i) == 'U')||
                (Str.charAt(i) == 'a')||
                (Str.charAt(i) == 'e')||
                (Str.charAt(i) == 'i')||
                (Str.charAt(i) == 'o')||
                (Str.charAt(i) == 'u'))   
               {
                    iCount++;
               }
               i++;
        }
        return iCount;
    }
}

class Program210
{
    public static void main(String A[])
    {
        int iRet = 0;
        String S1 = null;
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter String : ");
        S1 = sobj.nextLine();
        
        CountVowels cobj = new  CountVowels(S1);
        iRet = cobj.Display();
        System.out.println("Count Of Vowels is : "+iRet);
    }
}
