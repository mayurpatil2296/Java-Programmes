import java.util.*;
import java.io.*;
class Demo
{
	char ch1='A';
	char ch2='B';		
	void fun11(int No1)
	{
		if(No1<0)
		{
		No1=-No1;

		}
		for(int i=1;i<=No1;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}

		}		

	}

}

class Demo2 extends Demo
{
	int Num1=5;
	int Num2=7;	
	
	void fun12()
	{
	char Temp;
	System.out.println("Before Swapping Both Character");
	System.out.println(super.ch1);
	System.out.println(super.ch2);
	
	Temp=ch1;
	ch1=ch2;
	ch2=Temp;	
	
	System.out.println("After Swapping Both Character");
	System.out.println(super.ch1);
	System.out.println(super.ch2);


	}
	

}

class Demo3 extends Demo2
{
	
	void fun13()
	{
	int Temp=0;
	System.out.println("Before Swapping Both Integer");
	System.out.println(super.Num1);
	System.out.println(super.Num2);
	
	Temp=Num1;
	Num1=Num2;
	Num2=Temp;	
	
	System.out.println("After Swapping Both Integer");
	System.out.println(super.Num1);
	System.out.println(super.Num2);


	}	


}

class Demo4 extends Demo2
{
	
	void fun14()
	{

	System.out.println("Before Swapping Both Integer");
	System.out.println(super.Num1);
	System.out.println(super.Num2);
	
	Num2=Num2+Num1;
	Num1=Num2-Num1;	
	Num2=Num2-Num1;
	
	System.out.println("After Swapping Both Integer");
	System.out.println(super.Num1);
	System.out.println(super.Num2);

	}	
	void fun15(char ch1)
	{
		if((ch1=='a')||(ch1=='e')||(ch1=='i')||(ch1=='o')||(ch1=='u')||
		(ch1=='A')||(ch1=='E')||(ch1=='I')||(ch1=='O')||(ch1=='U'))
		{
			System.out.println("Given Charcater is Vowel");

		}
		else
		{
			System.out.println("Given Charcater is Not-Vowel");
		
		}
		
	}
	void fun16(int No1,int No2)
	{
		if(No1<0)
		{
			No1=-No1;
		}

		if(No2<0)
		{
			No2=-No2;
		}
		int i=1;
		while((i<=No1/2)&&(i<=No2/2))
		{
			if((No1%i==0)&&(No2%i==0))
			{

				System.out.println(i);
				i++;
			}


		}




	}



}




class Assign4
{	
	public static void main(String agrs[])	throws Exception
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter First number:-");	
		int No1=obj.nextInt();
		
		System.out.println("Enter Second Number:-");
		int No2=obj.nextInt();
		Demo d1=new Demo();
		System.out.println("Accept One Number From User Display all the Even Between That Number");	
		d1.fun11(No1);


		System.out.println("Accept Two Characterstic From User Swap Both Character");
		Demo2 d2=new Demo2();
		d2.fun12();
		
		System.out.println("Accept Two Number And Swap Both Number Using Tempary Variable");
		Demo3 d3=new Demo3();
		d3.fun13();

		System.out.println("Accept Two Number And Swap Both Number Without-Using Tempary Variable");
		Demo4 d4=new Demo4();
		d4.fun14();

		System.out.println("Accept Character From User And Check That Chracter is Vowel Or Not");
		InputStreamReader ip=new InputStreamReader(System.in);
		BufferedReader bf=new BufferedReader(ip);
		System.out.println("Enter Character to Check The Vowel or Not:-");
		char ch1=(char)bf.read();
		
		d4.fun15(ch1);

		
		System.out.println("Accept Two Number From User and Display common Fcator of That Number");
		d4.fun16(No1,No2);
		
		

		
	}
	
}
