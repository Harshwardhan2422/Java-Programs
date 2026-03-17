import java.util.Scanner;

class Demo
{
    public float fPercentage;
    
    Demo(float fNo)
    {
        fPercentage = fNo;
    }
    
    public void DisplayResult()
    {
        if(fPercentage >= 35)
        {
            System.out.println(" You Are Pass ");
        }
        else
        {
            System.out.println(" You Are Fail ");
        }
    }
}

class Program16
{
    public static void main(String A[])
    {
        Scanner Sc = new Scanner(System.in);
        
        float fValue = 0.0f;
        
        System.out.println("Enter Your Percentage : ");
        fValue = Sc.nextFloat();
        
        Demo dobj = new Demo(fValue);
        dobj.DisplayResult();
        
      }
}