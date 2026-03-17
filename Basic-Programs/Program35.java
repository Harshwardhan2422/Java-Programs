class Display
{
    public void DisplayResult()
    {
        int iCnt = 0;
        iCnt = 1;
        
        while(iCnt <= 5)
        {
            System.out.println("\n Never Give Up \n");
            iCnt++;
        }
    }
}

class Program35
{
    public static void main(String A[])
    {
        Display dobj = new Display();
        dobj.DisplayResult();
    }
}
