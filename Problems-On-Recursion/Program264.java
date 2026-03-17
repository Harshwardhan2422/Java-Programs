class Recursion 
{
    public void DisplayR()
    {
        int i = 1;
        
        while(i <= 5)
        {
            System.out.print("*\t");
            i++;
            DisplayR();
        }        
    }
}

class Program264
{
    public static void main(String A[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }
}