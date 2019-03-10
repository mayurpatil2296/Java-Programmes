import java.lang.*;
class Exception_Demo7

	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block");
			int arr[]={10,20,30,40};
			System.out.println("Inside main"+arr[6]);
			System.out.println("After getting exception");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch block");
			System.out.println(e);	
		}
		finally
		{
			System.out.println("Inside finally block");	
		}
		System.out.println("After finally block");		
	}
}