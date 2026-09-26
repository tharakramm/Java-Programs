import java.util.*;

class Stud
{
	int sid,m1,m2,m3;
	String sname;
	
	void displaydet()
	{
		System.out.println("Student Name : "+sname);
		System.out.println("Student ID : "+sid);
		System.out.println("Marks 1 : "+m1);
		System.out.println("Marks 2 : "+m2);
		System.out.println("Marks 3 : "+m3);
	}
	
	void total()
	{
		System.out.println("Total Marks = "+(m1+m2+m3));
	}
	
	void avg()
	{
		System.out.println("Average marks = "+((m1+m2+m3)/3));
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		Stud s=new Stud();
		
		System.out.print("Enter name : ");
		s.sname=sc.nextLine();
		
		System.out.print("Enter ID : ");
		s.sid=sc.nextInt();
		
		System.out.print("Enter Marks1: ");
		s.m2=sc.nextInt();
		
		System.out.print("Enter Marks2: ");
		s.m1=sc.nextInt();
		
		System.out.print("Enter Marks3: ");
		s.m3=sc.nextInt();
		
		s.displaydet();
		s.total();
		s.avg();
	}
}	