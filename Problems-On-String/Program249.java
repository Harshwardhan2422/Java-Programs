import java.util.Scanner;

class CountNumber 
{
    public int str[];
    public int iSize;
    
    CountNumber(int Brr[], int iNo)
    {
        str = Brr;
        iSize = iNo;
    }
    
    public void Display()
    {
        int iEven = 0, iOdd = 0, iPos = 0, iNeg = 0, iZero = 0;
        int i = 0;
        
        for(i = 0; i < str.length; i++)
        {
            if(str[i] % 2 == 0)
            {
                iEven++;
            }
            else
            {
                iOdd++;
            }
            
            if(str[i] > 0)
            {
                iPos++;
            }
            else if(str[i] < 0)
            {
                iNeg++;
            }
            else
            {
                iZero++;
            }            
        }
        
        System.out.println("Even Numbers : "+iEven);
        System.out.println("Odd Numbers : "+iOdd);
        System.out.println("Positive Numbers : "+iPos);
        System.out.println("Negative Numbers : "+iNeg);
        System.out.println("Zero Numbers : "+iZero);
                
    }    
}

class Program249
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int iValue = 0, i = 0;
        
        System.out.println("Enter How many Elements : ");
        iValue = sobj.nextInt();
        
        if(iValue <= 0)
        {
            System.out.println("Invalid Number Of Element ");
            return;
        }
        
        int Arr[] = new int[iValue];
        
        System.out.println("Enter The  Elements : ");
        for(i = 0; i < iValue; i++)
        {
            Arr[i] = sobj.nextInt();
        }
        
        CountNumber cobj = new CountNumber(Arr, iValue);
        cobj.Display();
        
    }
}