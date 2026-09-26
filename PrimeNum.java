import java.util.*;

class PrimeNum
{
    int isPrime(int x)
    {
        int c=0;
        
        for(int i=1; i<=x; i++)
        {
            if(x%i==0)
            {
                c=c+1;
            }
        }
        
        return c;
    }
    
    public static void main(String args[])
    {
        int x,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number : ");
        x=sc.nextInt();
        
        if(x<=0)
        {
            System.out.println("Invalid Number");
            return;
        }
        
        PrimeNum p=new PrimeNum();
        
        c=p.isPrime(x);
        
        if(c==2)
        {
            System.out.println(x+" Is a prime number");
        }
        
        else
        {
            System.out.println(x+" Is not a prime number");
        }
    }
}