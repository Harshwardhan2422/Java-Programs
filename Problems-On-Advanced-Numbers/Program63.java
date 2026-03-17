class Demo
{
    public void Display()
    {
        int Arr[] = {12,13,14,15};
        int iCnt = 0;
        
        for(iCnt = 0; iCnt < 4; iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }
    }
}

class Program63
{
    public static void main(String A[])
    {
        Demo dobj = new Demo();
        dobj.Display();
    }
}