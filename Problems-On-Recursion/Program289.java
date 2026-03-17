class DisplayResult 
{
    public int Brr[];
    
    DisplayResult(int crr[])
    {
        Brr = crr;
    }
    
    public void Display()
    {
        int i = 0;
        
        while(i < Brr.length)
        {
            System.out.println(Brr[i]);
            i++;
        }
    }
}

class Program289
{
    public static void main(String A[])
    {
        int Arr[] = {10,20,30,40,50};
        
        DisplayResult dobj = new DisplayResult(Arr);
        dobj.Display();
        
    }
}