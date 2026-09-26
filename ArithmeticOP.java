import java.util.*;

class ArithmeticOP
{
    static int a,b,sum,sub,mul;
    static float div,mod;
    
    int addition()
    {
        return a+b;
    }
    
    int subtraction()
    {
        return a-b;
    }
    
    int multiply()
    {
        return a*b;
    }
    
     float division()
    {
            return (float)a/b;
    }
    
    float modulus()
    {
        return (float)a%b;
    }
    
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        ArithmeticOP ab=new ArithmeticOP();
        
        System.out.print("Enter a : ");
        ab.a=sc.nextInt();
        
        System.out.print("Enter b : ");
        ab.b=sc.nextInt();
        
        sum=ab.addition();
        sub=ab.subtraction();
        mul=ab.multiply();
        
        mod=ab.modulus();
        
        System.out.println("Addition = "+sum);
        System.out.println("Subtraction = "+sub);
        System.out.println("Multiplication = "+mul);
        System.out.println("Modulus = "+mod);
        
        if(b==0)
        {
            System.out.println("Division By Zero Is Undefined ");
            return;
        }
        div=ab.division();
        System.out.println("Div = "+div);
    
    }
}
    