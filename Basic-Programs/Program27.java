class Display 
{
    public void DisplayResult()
    {
        int iCnt = 0;
        
        for(iCnt = 1; iCnt <= 5; iCnt++)
        {
            System.out.println("Hello Java...!");
        }
    }
}

class Program27
{
    public static void main(String A[])
    {
        Display dobj = new Display();
        dobj.DisplayResult();
    }
}