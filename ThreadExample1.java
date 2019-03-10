import java.util.*;
class Demo implements Runnable
{
	public void run()
	{
		//BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		Scanner obj=new Scanner(System.in);
			
		int i=0;
		for(i=1;i<=10;i++)
		{
		System.out.println("Wake-Up at 1Pm In Morning:--");
		
		System.out.println("Later That Launch 1-Hour");
			for(i=1;i<=5;i++)
			{	try
				{
				System.out.println("Still Eating");
				Thread.sleep(3000);
				}
				catch(Exception ii)
				{}

			}
						
		System.out.println("After Launching");	
		System.out.println("Thing To Learn Something new");
		for(i=1;i<=4;i++)
		{
			System.out.println("Studying");
			try
			{
				Thread.sleep(3000);	
			}
			catch(InterruptedException po){};
		}
		System.out.println("After Studying Go For Dinner");
		for(i=1;i<=4;i++)
		{
			System.out.println("Still Eating");
			try
			{
				Thread.sleep(3000);	
			}
			catch(InterruptedException po){};
	
		}		
		System.out.println("Dinner Is Completed");
	
		System.out.println("After Dinner");
		for(i=1;i<=4;i++)
		{	try
			{
			System.out.println("Still Stdying..");
				Thread.sleep(3500);
			}
		catch(InterruptedException wpo){};

		}
		System.out.println("Study Completed");
		System.out.println("After Study Now Movie Time");
		int str=123;
		int Movie;
		System.out.println("Opening You-tube");
		System.out.println("Enter Movie Name to See:--");
		Movie=obj.nextInt();
		if(Movie==str)
		{	
			for(i=1;i<=5;i++)
			{
			try
			{
				System.out.println("Still Watching Movie");
				Thread.sleep(3500);
			}
			catch(Exception o)
			{}
			}		
			
		}
		else
		{	
			for(i=1;i<=8;i++)
			{
			try
			{
				System.out.println("Still-Sleeping");
				Thread.sleep(2000);			
			}
			catch(InterruptedException oi)
			{}
			}
		}
			
		}

	}
	
}

class Thread1
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		Thread t1=new Thread(obj);
		t1.start();

	}


}
