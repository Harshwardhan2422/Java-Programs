class PatternPrinter
{
    public void Display()
    {
        int i = 0, j = 0;
        
        for(i = 1; i <= 4; i++)
        {
            for(j = 1; j <= 3; j++)
            {
                System.out.print("*\t");
            }
            System.out.println("");
        }
    }
}

class Program138
{
    public static void main(String A[])
    {
        PatternPrinter obj = new PatternPrinter();
        obj.Display();
    }
}