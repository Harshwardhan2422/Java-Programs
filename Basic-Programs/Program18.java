import java.util.Scanner;

class Demo
{
    public float fPercentage = 0.0f;
    
    Demo(float fNo)
    {
        fPercentage = fNo;
    }
    
    public void DisplayResult()
    {
        if((fPercentage < 0.0f) || (fPercentage > 100.0f))
        {
            System.out.println("Invalid Percentage. Please Enter the Value in Range 0 To 100");
            return;
        }
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
class Program18
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        
        Scanner sobj = new Scanner(System.in);
        System.out.println("Enter Your Percentage");
        fValue = sobj.nextFloat();
        
        Demo dobj = new Demo(fValue);
        dobj.DisplayResult();
        
    }
}