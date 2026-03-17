class Recursion 
{
    public void DisplayR()
    {
        int i = 0;
        
        for(i = 1; i <= 5; i++)
        {
            System.out.print("*\t");
            i++;
            DisplayR();
        }
    }
}

class Program265
{
    public static void main(String A[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }
}