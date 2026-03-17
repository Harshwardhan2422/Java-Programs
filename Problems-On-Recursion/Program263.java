class Recursion
{
    public void Display()
    {
        int i = 0;
        i = 1;
        
        while(i <= 5)
        {
            System.out.print("*\t");
            i++;
        }      
    }
}

class Program263
{
    public static void main(String A[])
    {
        Recursion obj = new Recursion();
        obj.Display();
    }
}