import java.util.*;

class Atm
{
    int pin=7190;
    double balance=5000.00;
    
    
    Scanner sc=new Scanner(System.in);
    
    Atm(int pin)
    {
        if(pin!=this.pin)
        {
            System.out.println("Incorrect Pin! ");
        }
        
        else
        {
            deposit();
            withdraw();
        }    
          
       
    }
    
    void deposit()
    {
        System.out.print("Enter amount to deposit : ");
       double amount=sc.nextDouble();
        balance=amount+balance;
        showBalance();
    }
    
    void withdraw()
    {
        System.out.print("Enter amount to withdraw : ");
       double withdraw=sc.nextDouble();
        if(withdraw>balance)
        {
            System.out.println("Insufficient Balance!");
        }
        
        else
        {
            balance=balance-withdraw;
            showBalance();
        }
        
    }
    
    void showBalance()
    {
        System.out.println("Balance Fetched Successfully\n Current Balance = "+balance);
    }
    public static void main(String args[])
    {
        int pin;
        
        Scanner s=new Scanner(System.in);
        
        System.out.print("Enter Pin : ");
        pin=s.nextInt();
        
        Atm a=new Atm(pin);
        
        
    }
}    