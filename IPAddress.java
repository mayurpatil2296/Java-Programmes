//Using The Programme You Can See How To Get Ip Address of Particular Website Or Hostname
import java.io.*;
import java.net.*;
class IPAddress
{
	public static void main(String args[])throws Exception
	{
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter Website");
		
		String s=BF.readLine();

		InetAddress i=InetAddress.getByName(s);

		System.out.println("IP Addres:-"+i);		
				

	}


}