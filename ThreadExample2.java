class Demo implements Runnable
{
	public void run()
	{	System.out.println("First Thread");

		for(int i=1;i<=6;i++)
		{
			System.out.println(i);
		}

	}
}

class Demo2 extends Demo implements Runnable
{

	public void run()
	{System.out.println("Second Thread");
	
		for(int i=1;i<=6;i++)
		{
			System.out.println(i);
		}

	}


}
class Thread3 
{
	public static void main(String agr[])
	{
		//Demo obj=new Demo();
		Demo2 obj2=new Demo2();
		//Thread t1=new Thread(obj);
		Thread t2=new Thread(obj2);
		//t1.start();
		
		t2.start();
		
	}


}
