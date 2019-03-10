class Demo extends Thread
{
	public void run()
	{
		
		synchronized(this)
		{

		System.out.println("Name Of Thread:-"+Thread.currentThread().getName());
		System.out.println("Priority of Thread:-"+Thread.currentThread().getPriority());
		Thread.currentThread().setName("Second");			
		Thread.currentThread().setPriority(10);
		
		for(int i=1;i<=10;i++)	
		{

			System.out.println(i);
			try
			{
				Thread.sleep(2000);

			}	
			catch(InterruptedException o){}
		}
		}
	}


}
class Thread5
{

	public static void main(String ags[])
	{
		Demo obj=new Demo();
		//Demo obj=new Demo();
		Thread t1=new Thread(obj);
		Thread t2=new Thread(obj);
		t2.setName("Second");			
		t2.setPriority(10);
		t1.start();
		t2.start();
	}	




}
