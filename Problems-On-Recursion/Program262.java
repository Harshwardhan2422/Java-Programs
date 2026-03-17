class Recursion
{
    public void Display()
    {
        int i = 0;
        
        for(i = 1; i <= 5; i++)
        {
            System.out.print("*\t");
        }
    }
}

class Program262
{
    public static void main(String A[])
    {
        Recursion obj = new Recursion();
        obj.Display();
    }
}