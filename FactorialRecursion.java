import java.util.*;

class FactorialRecursion
{
    int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
    
    public static void main(String args[])
    {
        int n,v;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter n :");
        n=sc.nextInt();
        
        if(n<0)
        {
            System.out.println("Invalid Input");
            return;
        }
        
        FactorialRecursion r=new FactorialRecursion();
        
        v=r.fact(n);
        
        System.out.println("Factorial of "+n+" = "+v);
        
    }
}