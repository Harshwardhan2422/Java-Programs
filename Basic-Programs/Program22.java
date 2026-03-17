import java.util.Scanner;

class Demo
{
    public int iNo;
    
    Demo(int iValue)
    {
        iNo = iValue;
    }
    
    public void DisplayResult()
    {
        switch(iNo)
        {
            case 8:
                System.out.println("Your Exam At 8am");
                break;
                
            case 9:
                System.out.println("Your Exam At 9am");
                break;
                
             case 10:
                System.out.println("Your Exam At 10am");
                break;
                
            case 11:
                System.out.println("Your Exam At 11am");
                break;
                
             case 12:
                System.out.println("Your Exam At 12pm");
                break;  
                
             default:
                 System.out.println("Sorry!We don't have information about your Standard");  
                                         
        }
    }
}

class Program22
{

    public static void main(String A[])
    {
        int iStandard = 0;
        
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter Your Standard");
        iStandard = SC.nextInt();
        
        Demo dobj = new Demo(iStandard);
        dobj.DisplayResult();
        
    }
}
