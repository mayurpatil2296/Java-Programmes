//Every URL Consider The Four Part Like Prototype,Port Number etc You Can Display The This All Part About Any URL Follow Programme
import java.net.*;
import java.io.*;

class URL_Format
{
	public static void main(String args[])	throws Exception
	{
		URL obj=new URL("http://www.facebook.com/index.html);

		System.out.println("Protocol:-"+obj.getProtocol());	//-1 	
		System.out.println("Host Name:-"+obj.getHost());		
		System.out.println("Port Number:-"+obj.getPort());		
		System.out.println("Path:-"+obj.getPath());		
		System.out.println("Path:-"+obj.getFile());		

	}


}