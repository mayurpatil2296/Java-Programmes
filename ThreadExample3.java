class Demo implements Runnable
{
	synchronized public void run()
	{
		
	{

		Thread m=Thread.currentThread();
		System.out.println(m);		
		for(int i=1;i<=7;i++)
		{
			try
			{
			System.out.println(i);
			Thread.sleep(2000);			
			
			}		
			catch(Exception io)
			{
				System.out.println(io);
			}
		}
		}
		
	}
}

class Thread4
{
	public static void main(String args[])
	{
		Demo obj=new Demo();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
	
		Thread t3=new Thread(obj);
		t1.setName("xyz");		
		t2.setName("pqr");		
		t3.setName("mno");	
		t1.start();
		t2.start();
		t3.start();

	}




}
