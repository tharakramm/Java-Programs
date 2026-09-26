import java.util.*;

class Students
{
    String name;
    int marks;
    
    Students()
    {
        System.out.println("No Student Data");
    }
    
    Students(String name)
    {
        this.name=name;
        
        System.out.println("Name : "+this.name);
    }
    
    Students(String name, int marks)
    {
        this.name=name;
        this.marks=marks;
        
        System.out.println("Name : "+this.name+"\n"+"Marks : "+this.marks);
    
    }
    
    public static void main(String args[])
    {
        int marks;
        String name;
        Students s=new Students();
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter name : ");
        name=sc.next();
        Students s1=new Students(name);
        System.out.print("Enter marks : ");
        marks=sc.nextInt();
        
        
        Students s2=new Students(name,marks);
        
    }
}
        