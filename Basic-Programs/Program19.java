import java.util.Scanner;

class Demo
{
    public float fPercentage = 0.0f;
    
    Demo(float fNo)
    {
        fPercentage = fNo;
    }
    
    void DisplayResult()
    {
        if((fPercentage >= 0.0f)  &&  (fPercentage <= 100.0f))
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
        else
        {
            System.out.println("Invalid Percentage. please Enter the Value in Range 0 To 100");
            return;
        }
    }
}

class Program19
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        
        Scanner Sc = new Scanner(System.in);
        System.out.println(" Enter Your Percentage ");
        fValue = Sc.nextFloat();
        
        Demo dobj = new Demo(fValue);
        dobj.DisplayResult();
        
    }
}