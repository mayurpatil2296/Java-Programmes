import java.net.*;
import java.io.*;

class Server
{
	public static void main(String args[])throws Exception
	{
			
		ServerSocket ss=new ServerSocket(2100);

		Socket s=ss.accept();
		
		DataInputStream Di=new DataInputStream(s.getInputStream());		
		DataOutputStream Do=new DataOutputStream(s.getOutputStream());		
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		String str="",str2="";		
		while(!str.equals("Stop"))
		{
			str=Di.readUTF();
			System.out.println("Client Say:-"+str);

			str2=BF.readLine();
			Do.writeUTF(str2);			
		
		}		
	
		s.close();
		ss.close();
		Di.close();
		Do.close();
	
	}


}