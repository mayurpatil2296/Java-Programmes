import java.lang.*;
class Exception_Demo4
{

	public static void main(String args[])
	{
		try
		{
			System.out.println("Inside try block");
			
			ArrayIndexOutOfBoundsException obj;
			obj=new ArrayIndexOutOfBoundsException("New exception");
			throw obj;	
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Inside second catch block");
			System.out.println(e);	
		}

		catch(NullPointerException ee)
		{
			System.out.println("Inside second catch block");
			System.out.println(ee);	
		}
	}
}

