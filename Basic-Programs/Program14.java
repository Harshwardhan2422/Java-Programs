import java.util.Scanner;

class CircleOfArea
{
    public float fRadius;
    
    CircleOfArea(float fNo)
    {
        fRadius = fNo;
    }
    
    float CircleArea()
    {
        float fArea = 0.0f;
        
        if(fRadius < 0)
        {
            fRadius = - fRadius;           
        }
        
        fArea = 3.14f  * fRadius * fRadius;
        return fArea;
    }    
}

class Program14
{
    public static void main(String A[])
    {
        float fValue = 0.0f, fResult = 0.0f;
        
        Scanner Sc = new Scanner(System.in);
        
        System.out.println("Enter Radius of Circle : ");
        fValue = Sc.nextFloat();
        
        CircleOfArea cobj = new CircleOfArea(fValue);
        
        fResult = cobj.CircleArea();
        System.out.println("Area of Circle is : "+fResult);
    }
}