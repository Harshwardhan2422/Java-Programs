class Program41
{
    public static void main(String A[])
    {
        int iNo = 25;
        boolean bRet = false;
        
        bRet = (iNo %  5 == 0);
        
        if(bRet == true)
        {
            System.out.println("Divisible By 5 : "+iNo);           
        }
        else
        {
            System.out.println("Not Divisible By 5 "+iNo);          
        }               
    }
}
