import java.util.Scanner;

class Ascending 
{
    public int Arr[];
    public int iSize;
    
    Ascending(int iNo)
    {
        iSize = iNo;      
        Arr = new int[iSize];
    }
    
    public void Accept(Scanner obj)
    {
        int i = 0;
        
        System.out.println("Enter The Elements : ");
        for(i = 0; i < iSize; i++)
        {
            Arr[i] = obj.nextInt();
        }
    }
    
    public void Display()
    {
        int i = 0, j = 0, temp = 0;
        
        for(i = 0; i < iSize; i++)
        {
            for(j = i + 1; j < iSize; j++)
            {
                if(Arr[i] > Arr[j])
                {
                    temp = Arr[i];
                    Arr[i] = Arr[j];
                    Arr[j] = temp;
                }
            }        
        }      
        System.out.println("Ascending Order Is : ");
        for(i = 0; i < iSize; i++)
        {
            System.out.println(Arr[i]);
        }
    }
}

class Program255
{
    public static void main(String A[])
    {
        int iValue = 0;
        Scanner sobj = new Scanner(System.in);
        
        System.out.print("Enter How Many Elements : ");
        iValue = sobj.nextInt();
        
        Ascending aobj = new Ascending(iValue);
        aobj.Accept(sobj);
        aobj.Display();        
    }
}