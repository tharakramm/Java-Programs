import java.util.*;

class LargeNum
{
    public static void main(String args[])
    {
        int a,b,c;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter a,b & c : ");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        
        if(a==b && b==c)
        {
            System.out.println("All Are Equal");
        }
        
        else if(a>=b && a>=c)
        {
            System.out.println(a+" Is Greater");
        }
        
        else if(b>=a && b>=c)
        {
            System.out.println(b+" Is Greater");
        }
       
        else
        {
            System.out.println(c+" Is Greater");
        }
            
    }
}