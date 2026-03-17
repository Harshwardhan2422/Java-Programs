import java.util.Scanner;

class Program8
{
    public static void main(String A[])
    {
        float fNo1 = 0.0f, fNo2 = 0.0f, fAns = 0;
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        iNo1 = sobj.nextInt();
        System.out.println("Enter Second Number : ");
        iNo2 = sobj.nextInt();
        
        System.out.println("Enter First Number : ");
        fNo1 = sobj.nextFloat();
        System.out.println("Enter Second Number : ");
        fNo2 = sobj.nextFloat();
              
        iAns = iNo1 + iNo2;
        fAns = fNo1 + fNo2;
        
        System.out.println("   "+ iNo1 +"\t\t"+ "   "+ fNo1 );
        System.out.println(" +  "+ iNo2 +"\t\t"+ " +  "+ fNo2 );
        System.out.println("---------\t\t-------");
        System.out.println("   "+ iAns+"\t\t"+ "   "+ fAns );
        
        
    }
}