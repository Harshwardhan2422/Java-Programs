import java.util.Scanner;

class AreaOfCircle
{
    public float fRadius;
    
    AreaOfCircle(float fradius)
    {
        fRadius = fradius;
    }
   
    float CircleArea() 
    {   
        float fArea = 0.0f;
        
        fArea = 3.14f  *  fRadius * fRadius;
        return fArea;
    }    
}

class Program13
{
    public static void main(String A[])
    {
        float fValue = 0.0f, fResult = 0.0f;
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter Radius Of Circle : ");
        fValue = Sc.nextFloat();
        
        AreaOfCircle aobj = new AreaOfCircle(fValue);
        fResult = aobj.CircleArea();
        
        System.out.println("Area OF Circle is : "+fResult);
                
    }
}