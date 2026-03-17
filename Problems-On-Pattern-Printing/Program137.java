class PatternPrinter
{
    public void Display()
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= 3; iCnt++)
        {
            System.out.print("*\t");
        }        
        System.out.println(" ");
        
        for(iCnt = 1; iCnt <= 3; iCnt++)
        {
            System.out.print("*\t");
        }        
        System.out.println(" ");
        
        for(iCnt = 1; iCnt <= 3; iCnt++)
        {
            System.out.print("*\t");
        }        
        System.out.println(" ");      
    }
}

class Program137
{
    public static void main(String A[])
    {
        PatternPrinter obj = new PatternPrinter();
        obj.Display();
    }
}