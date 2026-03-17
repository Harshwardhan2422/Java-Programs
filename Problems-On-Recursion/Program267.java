class Recursion 
{
     static int iCnt = 1;
    
    public void DisplayR()
    {
        if(iCnt <= 5)
        {
            System.out.print("*\t");
            iCnt++;
            DisplayR();
        }
    }
}

class Program267
{
    public static void main(String A[])
    {
        System.out.println("Inside Main");
        
        Recursion obj = new Recursion();
        obj.DisplayR();
        
        System.out.println("Inside End");
    }
}