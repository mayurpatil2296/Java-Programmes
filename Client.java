import java.net.*;
import java.io.*;

class Client
{
	public static void main(String args[])throws Exception
	{

		Socket s=new Socket("localhost",2100);

		DataInputStream Di=new DataInputStream(s.getInputStream());
		DataOutputStream Do=new DataOutputStream(s.getOutputStream());
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));

		String str="",str2="";
		
		while(!str.equals("Stop"))
		{
			str=BF.readLine();
			Do.writeUTF(str);

			Do.flush();

			str2=Di.readUTF();

			System.out.println("Server Say:-"+str2);
		}
		
		Do.close();
		Di.close();
		s.close();
	
	}


}