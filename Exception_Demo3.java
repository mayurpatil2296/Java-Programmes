import java.lang.*;
class Exception_Demo3
{

	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block");
			int arr[]={10,20,30,40};
			System.out.println("Inside main"+arr[6]);
			System.out.println("After getting exception");
		}

		catch(NullPointerException e)
		{
			System.out.println("Inside First catch block");
			System.out.println(e);	
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside second catch block");
			System.out.println(e);	
		}
	}
}
