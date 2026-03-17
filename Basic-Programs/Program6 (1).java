import java.util.Scanner;

class Addition 
{
    public float fAdd = 0.0f;
    
    public float AdditionFloat(float fValue1, float fValue2)
    {
        fAdd = fValue1 + fValue2;
        return fAdd;
    }
}

class Program6
{
    public static void main(String A[])
    {
        float fNo1 = 0.0f, fNo2 = 0.0f, fAns = 0.0f;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        fNo1 = sc.nextFloat();
        
        System.out.println("Enter Second Number : ");
        fNo2 = sc.nextFloat();
        
        Addition aobj = new Addition();
        
        fAns = aobj.AdditionFloat(fNo1, fNo2);
        
        System.out.println("Addition is : "+fAns);
              
    }
}