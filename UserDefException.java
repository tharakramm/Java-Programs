import java.util.*;

class AgeException extends Exception
{
	AgeException(String msg)
	{
		super(msg);
	}
}	

class UserDefException
{
	public static void main(String args[])
	{
		int age;
		
		Scanner sc=new Scanner(System.in);
		
		try
		{
			System.out.print("Enter Age : ");
			age=sc.nextInt();
			
			if(age<18)
			{
				throw new AgeException("You are Not Eligible To Vote!");
			}
			
			System.out.println("You Are Eligible To Vote! ");
		}
		
		catch(AgeException e)
		{
			System.out.println(e.getMessage());
		}
	}
}	
			
			