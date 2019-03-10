import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
	public int fun1(int No1,int No2)
	{
		if(No1<0)
		{
			No1=-No1;
		}
		if(No2<0)
		{
			No2=-No2;
		}	
		return No1/No2;

	}	
	public void fun2(int No1)
	{	
		if(No1<0)
		{
			No1=-No1;
		}

		for(int i=1;i<=No1;i++)
		{
			System.out.println("*\t");
		}

	}

	public void fun3(int No1)
	{	
		if(No1<0)
		{
			No1=-No1;
		}

		for(int i=1;i<=No1;i++)
		{
			System.out.println(i);
		}

	}
	public int fun4(int No1)
	{
		if(No1%5==0)
		{

			return 1;
		}
		else
		{
			return 0;
		}
			
	}
	public void fun5(char ch)
	{
		System.out.println("Given Charcater is:-"+ch);
	}
	public int fun6(int No1)
	{
		return No1-5;
	}
	void fun7(int No1)
	{
		if(No1<0)
		{
			No1=-No1;		
		}
		if(No1>10)
		{
			System.out.println("Hello");	
		}
		else
		{
			System.out.println("Demo");
		}
	
	}
	void fun8(int No1)
	{

		if(No1<0)
		{
			No1=-No1;
		}
		int i=1;

		while(i<=N01)
		{
			System.out.println(i);
			i++;

		}
	}

}
class Assign
{
	public static void main(String args[]) throws Exception
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First Number:-");
		int No1=obj.nextInt();
		
		System.out.println("Enter Second Number");		
		int No2=obj.nextInt();
	
		Demo obj2=new Demo();
		
		System.out.println("Accept Two Number From USer And Divide First Number With Second");
		int Ret=obj2.fun1(No1,No2);			
		System.out.println("Division:-"+Ret);
		
		System.out.println("Accept One Number From User And Display * on Screen That number of Time");
		obj2.fun2(No1);

		System.out.println("Accept One Number From User And Display Number On Screen");
		obj2.fun3(No1);

		System.out.println("Accept One Number From User and Check That Number Is Divisible by or Not");
		int Ret2=obj2.fun4(No1);
		if(Ret2==1)
		{
			System.out.println("Given Number IS Divisible By Five");
		}
		else
		{
		System.out.println("Given Number Is Not Divisible By Five");
		}

		System.out.println("Accept One Charcater From User Display That Character");
		BufferedReader obj4=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter character:-");
		char ch=(char)obj4.read();
		obj2.fun5(ch);		
		
System.out.println("Accept one Number From User And return That Number Subtracting with 5");	
		int Ret3=obj2.fun6(No1);
		System.out.println("Ans:-"+Ans);		

	
	System.out.println("Accept One Number From User Display Hello/Demo base on that number");
		obj2.fun7(No1);

	System.out.println("Accept One Number from User and Display "*" That Number Of Time Using While-Loop");

	obj2.fun8(No1);


	}


}
