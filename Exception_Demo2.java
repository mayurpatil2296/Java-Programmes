//import java.lang.*;

//When we run this application it generates exception
class Exception_Demo2
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

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside catch block");
			System.out.println(e);	
		}
		System.out.println("After Catch block");		
	}
}
