
import java.util.Scanner;

class Demo
{
    public int iNo = 0;
    
    Demo(int iValue)
    {
        iNo = iValue;
    }
    
    public void DisplayResult()
    {
        if(iNo <= 0)
        {
            iNo = - iNo;        // Updator 
        }
        
        switch(iNo)
        {
            case 8:
            case 9:
                System.out.println("Your Exam At 9am");
                break;
                
            case 10:
            case 11:
                System.out.println("Your Exam At 11am");
                break;
                
             case 12:
                 System.out.println("Your Exam At 1pm");
                 break;
                 
              default:
                  System.out.println("Sorry! we don't have information about your Standard");
                  break;   
        }
    }
    
}

class Program25
{
    public static void main(String A[])
    {
        int iStandard = 0;
        
        Scanner Sobj = new Scanner(System.in);
        System.out.println("Enter Your Standard : ");
        iStandard = Sobj.nextInt();
        
        Demo dobj = new Demo(iStandard);
        dobj.DisplayResult();
                
    }
}