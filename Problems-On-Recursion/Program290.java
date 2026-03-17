class Recursion 
{
    public int Brr[];
    static int iCnt = 0;
    
    Recursion(int Crr[])
    {
        Brr = Crr;
    }
    
    public void DisplayR()
    {
        if(iCnt < Brr.length)
        {
            System.out.println(Brr[iCnt]);
            iCnt++;
            DisplayR();
        }
    }
}

class Program290
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40,50};
        
        Recursion obj = new Recursion(Arr);
        obj.DisplayR();       
    }
}