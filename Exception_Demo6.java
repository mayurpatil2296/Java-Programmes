import java.lang.*;

class Demo
{
	// This function indicates that it may throw an checked excception
	void fun() throws Exception
	{
		int arr[]={10,20};
		System.out.println("Inside fun"+arr[5]);
	}
	
}

class Exception_Demo6
{

	public static void main(String args[])
	{
		Demo d=new Demo();
		// We can catch the exception which is generated from function
		try
		{
			d.fun();
		}
		catch(Exception e)
		{
			System.out.println("Inside catch : ");

			e.printStackTrace();	
			
		}
	}
}
