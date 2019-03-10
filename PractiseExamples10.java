import java.io.*;
class Recursion
{
	static int Count=0;
	static int CountDigit=0;
	 int Digit=0;
	static int result=0;
	static int ArrLength=0;
	static int ArrSum=0;
	static int i=2;
		static
		{
		int N;

		}
	 static void fun85(char ch,int Num)
	{
		if(Num<=0)
		{
			System.out.println("Display Chracter:--"+this.j);
		}
		
		else
		{
			System.out.println(ch);
			fun85(ch,Num-1);
		}
	}

	static void fun86(int Num2)
	{
		if(Num2<=0)
		{
			System.out.println("Display Element are:--");
		}
		else
		{
			System.out.println(Num2);
			fun86(Num2-1);
		}


	}
	 int fun87(int Num3)
	{
	
		if(Num3==1)
		{
			System.out.println();	
		}
		else
		{
			this.result*=Num3;
			fun87(Num3-1);	
		}
		
		return this.result;		
	}
	void fun88(String Str,int Count)
	{
		
		this.Count=Count;
		if(Count<0)
		{	
			System.out.println();
		}
		else
		{
			System.out.println(Str.charAt(Count-1));		
			fun88(Str,Count-1);		
		}
	}

	int fun89(int Num4)
	{
		if(Num4<=0)
		{

			System.out.print("");
		}
		else
		{
			this.Digit=Num4%10;
			CountDigit++;			
			fun89(Num4=Num4/10);	
		}
		return CountDigit;
	}

	int fun90(int Arr1[],int Length)
	{
		this.ArrLength=Length;
	
		if(Arr1==null)
		{
			System.out.println("There is No Element in the Array:");
		}
		if(ArrLength<0)
		{
			System.out.println();
		}
		else
		{
			ArrSum+=Arr1[ArrLength];
			fun90(Arr1,ArrLength-1);
		}
		return ArrSum;
	}

	void fun91(int Num5)
	{
		if(i>Num5/2)
		{
			System.out.println();		
		}
		else
		{
			if(Num5%i==0);
			{
				System.out.println(i);
			}
			i++;
			fun91(Num5);
		}		
	}	

}
class Assign15
{

	public static void main(String args[])throws Exception
	{
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		Recursion obj=new Recursion();
		int Choice;
		boolean Data=true;
		while(Data)
		{
		
		System.out.println("Enter Choice:--");
		Choice=Integer.parseInt(BF.readLine());	
		
		switch(Choice)
		{
		case 1:
		System.out.println("Accept One Character From User Display that Character Number Of Time Using Recursion");
		System.out.println("Enter The Character:--");		
		char ch=(char)BF.read();
		Recursion.fun85(ch,5);
		System.out.println();	
		break; 

		case 2:
		System.out.println("Accept One Number From user And Display the That Number On Screen Using Recursion");
		int Num0=Integer.parseInt(BF.readLine());
		Recursion.fun86(5);
		break;
	
		case 3:
		System.out.println("Accept One Number From User Display the Factorial Of That Number Using Recursion");
		System.out.println("Enter Number For Factorials:--");
		int Num2=Integer.parseInt(BF.readLine());
		int Fact=obj.fun87(Num2);
		System.out.println("Factorial Of Number:--"+Fact);
		break;
			
		case 4:
		System.out.println("Accept A String From User And Display the Character Of That String Using Recursion");
		System.out.println("Enter String");
		String Str=BF.readLine();
		int Cnt=Str.length();
		obj.fun88(Str,Cnt);
		System.out.println();
		break;		

		case 5:
		System.out.println("Accept A Number From User And Display the Number Of Digit Of That Number Using Recursion");
		System.out.println("Enter Number:--");
		int Num3=Integer.parseInt(BF.readLine());
		int CountDigit=obj.fun89(Num3);
		System.out.println("Number Of Digit in The Number:-"+CountDigit);		
		System.out.println();
		break;		
	
		case 6:
		System.out.println("Accept Array From User Display The Addition of ALl that Number Using Recursion");
		System.out.println("Enter Number Element For Array:--");
		int Num4=Integer.parseInt(BF.readLine());
		int Arr1[]=new int[Num4];
		
		System.out.println("Enter Number Of Elements:--");
		for(int i=0;i<Num4;i++)
		{
			Arr1[i]=Integer.parseInt(BF.readLine());
		}
		int ArrLength=Arr1.length;		
		int AddSum=obj.fun90(Arr1,ArrLength-1);
		System.out.println("Addition Of All Array Element iS--"+AddSum);
		System.out.println();
		break;
		
		case 7:
		System.out.println("Accept One Number From User And Display Its Common Factor:--");
		System.out.println("Enter Number:--");
		int Num5=Integer.parseInt(BF.readLine());
		obj.fun91(Num5);
		break;		


		case 0:
		Data=false;		
		break;	
		
		default:
		System.out.println("Wrong Choice");
			

		}
		}

	}






}
