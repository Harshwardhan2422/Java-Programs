
import java.util.Scanner;

class Addition 
{
    public int iAdd = 0;
    public float fAdd = 0;
    
    public int AdditionInt(int ivalue1, int ivalue2)
    {
        // Updator 
        if(ivalue1 < 0)
        {
            ivalue1 = -ivalue1;
        }
        if(ivalue2 < 0)
        {
            ivalue2 = -ivalue2;
        }
        
        iAdd = ivalue1 + ivalue2;
        return iAdd;
    }
    
    public float AdditionFloat(float fValue1, float fValue2)
    {
        //Updator 
        if(fValue1 < 0)
        {
            fValue1 = - fValue1 ;
        }
        if(fValue2 < 0)
        {
            fValue2 = - fValue2;
        }
        fAdd = fValue1 + fValue2;
        return fAdd;
    }
}

class Program10
{
    public static void main(String A[])
    {
        float fNo1 = 0.0f, fNo2 = 0.0f,  fAns = 0.0f;
        int iNo1 = 0, iNo2 = 0, iAns = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        iNo1 = sc.nextInt();
        System.out.println("Enter Second Number : ");
        iNo2 = sc.nextInt();
        
        System.out.println("Enter First Number : ");
        fNo1 = sc.nextFloat();
        System.out.println("Enter Second Number : ");
        fNo2 = sc.nextFloat();
        
        Addition aobj = new Addition();
        
        iAns = aobj.AdditionInt(iNo1, iNo2);
        System.out.println("Addition is : "+iAns);
        
        fAns = aobj.AdditionFloat(fNo1, fNo2);
        System.out.println("Addition is : "+fAns);
              
    }
}
