class Demo implements Runnable
{
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		
		}

	}

}


class Thread6
{
	public static void main(String arg[])
	{
	Demo obj=new Demo();
	Thread t1=new Thread(obj);
	t1.start();
		System.out.println(Thread.currentThread().isAlive());	
	
	}

}
