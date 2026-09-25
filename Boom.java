class Boom extends Thread
{
	public void run()
	{
		try
		{
			for(int i=1;i<3;i++)
			{
				System.out.print(i+" ");
				Thread.sleep(1000);
			}
			System.out.print("3");
			Thread.sleep(400);
      System.out.print("!");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("Boom💣!");
			System.out.println("💥");
			Thread.sleep(2000);
		}
		
		catch(InterruptedException e)
		{
			System.out.println(e);
		}	
	}
	
	public static void main(String args[])
	{
		Boom bo=new Boom();
		
		bo.start();
		
		try
		{
			bo.join();
		}
		
		catch(InterruptedException e1)
		{
			System.out.println(e1);
		}
		
		System.out.println("Hello From Heaven!");
	}
	
}	