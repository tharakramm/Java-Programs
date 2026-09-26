import java.util.*;

class Fibbonaci
{
    void fibb(int n)
    {
    
        int pv=0,sv=1,next;
        if (n <= 0) 
        {
            System.out.println("No terms");
            return;
        }

        if (n == 1) 
        {
            System.out.println("Fibonacci Series : 0");
            return;
        }        
        System.out.print("Fibbonaci Series : 0,1,");
        
        for(int i=0;i<n-2;i++)
        {
           
            next=pv+sv;
            pv=sv;
            sv=next;
            
            
            System.out.print(next+",");
        }
        
        System.out.print("...");
            
    }
    public static void main(String args[])
    {
        int n;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter Last no for fibbonaci : ");
        n=sc.nextInt();
        Fibbonaci f=new Fibbonaci();
        f.fibb(n);
        
    }
    
}