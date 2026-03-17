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

class Program266
{
    public static void main(String A[])
    {
        Recursion obj = new Recursion();
        obj.DisplayR();
    }
}