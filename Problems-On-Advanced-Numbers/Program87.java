import java.util.Scanner;

class DisplayOdd
{
    public int iSize;
    int []Arr;

    DisplayOdd(int iNo)  
    {  
        iSize = iNo;  
        Arr = new int[iSize];  
    }  
  
    public void Accept(Scanner obj)  
    {  
        int iCnt = 0;  
      
        System.out.println("Please Enter the Values : ");  
        for(iCnt = 0; iCnt < iSize; iCnt++)  
        {  
            Arr[iCnt] = obj.nextInt();  
        }  
    }  
  
    public void Display()  
    {  
        int iCnt = 0;  
      
        System.out.println("Values from Array Are : ");  
        for(iCnt = 0; iCnt < iSize; iCnt++)  
        {  
            if(Arr[iCnt] % 2 != 0)  
            {  
                System.out.println(Arr[iCnt]);  
            }  
         }  
      }  
}

class Program87
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        int ilength = 0;

        System.out.println("Enter Number Of Element : ");  
        ilength = sobj.nextInt();  
      
        if(ilength <= 0)  
        {  
            System.out.println("Size Must be Greater than zero!");  
            return;  
        }  
      
        DisplayOdd dobj = new DisplayOdd(ilength);  
        dobj.Accept(sobj);  
        dobj.Display();  
      }

}

