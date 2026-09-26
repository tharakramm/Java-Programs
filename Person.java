import java.util.*;

class Person
{
    int age;
    String name;
  
    Person(String name, int age)
    {
        this.name=name;
        this.age=age;
        
        System.out.println("Name= "+this.name+"\n"+"Age = "+this.age);
        
    }
    
    public static void main(String args[])
    {
        int age;
        String name;
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter name : ");
        name=sc.next();
        System.out.print("Enter age : ");
        age=sc.nextInt();
        
        if(age<0 || age>100)
        {   
            System.out.println("Invalid age");
        }
        
        else
        {
            Person p=new Person(name,age);
        }
        
        
        
    }
}