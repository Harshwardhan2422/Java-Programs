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
        if((fPercentage >= 0.0f)  &&  (fPercentage <= 100.0f))        //  Filter 
        {
            if(fPercentage >= 85.0f)
            {
                System.out.println(" Grade A : Excellent ");
            }
            else if(fPercentage >= 75.0f)
            {
                System.out.println(" Grade B : Very Good ");
            }
            else if(fPercentage >= 60.0f)
            {
                System.out.println(" Grade C : Good ");
            }
            else if(fPercentage >= 40.0f)
            {
                System.out.println(" Grade D : Pass ");
            }
            else
            {
                System.out.println(" Fail ");
            }
        }
        else
        {
            System.out.println(" Invalid Percentage. please Enter the Value in Range 0 To 100 ");
            
        }
    }
}

class Program20
{
    public static void main(String A[])
    {
        float fValue = 0.0f;
        
        Scanner SC = new Scanner(System.in);
        
        System.out.println(" Please Enter Your Percentage : ");
        fValue = SC.nextFloat();
        
        Demo dobj = new Demo(fValue);
        dobj.DisplayResult();
        
    }
}