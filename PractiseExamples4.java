import java.util.*;

class Demo
{
	int Num2=0;
	 void fun15(int Num1)
	{
		if(Num1<0)
		{
			Num1=-Num1;
		}
		int Count=0;
		this.Num2=Num1;
		while(Num1!=0)
			{
				Count++;
				Num1=Num1/10;

			}

		System.out.println("Number of Digit of Number:-"+Count);
	}
}

class Demo2 extends Demo
{
	int Num4=0;
	void fun16()
	{
		int Digit=0;
		int Sum=0;
		int Num3=0;
		
		Num3=Num2;
		this.Num4=Num2;	
	
		while(Num3!=0)
		{
			Digit=Num3%10;
			Sum+=Digit;
			Num3=Num3/10;

		}

		System.out.println("Sum Of Digit:-"+Sum);

	}

		

}
class Demo3 extends Demo2
{
			private int Num5=124;
			protected int Num6=Num5;
		void fun17()
		{
			if(Num5<0)
			{
				Num5=-Num5;

			}

			int EvenSum=0;
			int OddSum=0;
			int Digit=0;

			while(Num5!=0)
			{
				Digit=Num5%10;
				if(Digit%2==0)
				{

					EvenSum+=Digit;
				}
				else
				{
					OddSum+=Digit;

				}
			
			Num5=Num5/10;
			}
			int Diff=EvenSum-OddSum;
	
			System.out.println("Differnce Between Even And Odd:-"+Diff);
		
		}



}
class Demo4 extends Demo3
{
		
	void fun18()
	{
		int Num7=Num6;
	
		if(Num7<0)
		{
			Num7=-Num7;	

		}
		int Digit1=0;
		int Digit2=0;
		int Sum1=0;
		int fact=1;		
		int Sum2=0;

		while(Num7!=0)
		{
			Digit1=Num7%10;
			for(int i=1;i<=Digit1;i++)
			{
				fact*=i;	
			}

			Sum1=Sum1+fact;
			fact=1;
		Num7=Num7/10;
		}
	
		while(Sum1!=0)
		{
			Digit2=Sum1%10;
			Sum2+=Digit2;
			Sum1=Sum1/10;
		}
						
		System.out.println("Generic Root:-"+Sum2);		
				
		

	}


}
class Demo5 extends Demo
{
	
		
		void fun19(int Num8)
		{		
		
		if(Num8<0)
		{		
			Num8=-Num8;
		}

		int Num9=Num8;
		int Digit=0;
		int Sum=0,Fact=1;
		while(Num8!=0)
		{
			Digit=Num8%10;
			for(int i=Digit;i>=1;i--)
			{
				Fact=Fact*i;
	
			}
			Sum=Sum+Fact;
			Fact=1;
		Num8=Num8/10;
		}


		if(Num9==Sum)
		{
			System.out.println("Given Number Is Strong Number");
		
		}
		else
		{
			System.out.println("Given Number Is Not-Strong Number");
		
		}

	}


}

class Digit
{


	int fun20(int No1,int No2)
	{
		int Pow=1;
		for(int i=1;i<=No2;i++)
		{
			Pow*=No1;;

		}

		return Pow;

	}

	void fun21(int Number)
	{
		if(Number<0)
		{
			Number=-Number;

		}
		int Number2=Number;
		int Number3=Number;
		int Count=0;
		int Digit=0;
		int Sum=0;
		int Sum2=0;
		while(Number2!=0)
		{
			Count++;
			Number2=Number2/10;

		}
			while(Number!=0)
			{
				Digit=Number%10;
				Sum=fun20(Digit,Count);
				Sum2=Sum2+Sum;
				Number=Number/10;
			}
		
		if(Sum2==Number3)
		{
			System.out.println("Given Number Is Palindrome Number");

		}		
		else
		{
			System.out.println("Given Number Is Not-Palindrome Number");
		
		}

	
	}

	int fun22(int Number2)
	{
		if(Number2<0)
		{
			Number2=-Number2;

		}

		int Digit=0;
		int Mult=1;
		
		while(Number2!=0)
		{
			Digit=Number2%10;
			Mult*=Digit;	
			Number2=Number2/10;	

		}

		return Mult;
	}
		int fun23(int Number3)	
		{
			if(Number3<0)
			{
				Number3=-Number3;
			}
			int EvSum=0;	
			int Digit=0;			
			while(Number3!=0)
			{	
				Digit=Number3%10;
				if((Digit%2)==0)
				{
					EvSum+=Digit;
				}
				Number3=Number3/10;
			}			
		
			return EvSum;

		}

		int fun24(int Number4)	
		{
			if(Number4<0)
			{
				Number4=-Number4;
			}
			int CountDigit=0;
			int Digit=0;					
			while(Number4!=0)
			{	
				Digit=Number4%10;
				if(Digit==5)
				{
					CountDigit++;
				}			
			Number4=Number4/10;			
			}

			return CountDigit;

		}
	
		void fun25(int Number5)	
		{
			if(Number5<0)
			{
				Number5=-Number5;
			}
			int Rev=0;
			int Digit=0;				
			while(Number5!=0)
			{
				Digit=Number5%10;
				Rev=Rev*10+Digit;	
				Number5=Number5/10;
			}			
		
		System.out.println("Reverse Number:-"+Rev);

		}

		int fun26(int Number6)	
		{
			if(Number6<0)
			{
				Number6=-Number6;
			}
	
			int OddSum=0;			
			int Digit=0;				
			while(Number6!=0)
			{	
				Digit=Number6%10;
				if((Digit%2)==1)
				{
					OddSum+=Digit;
				}
			Number6=Number6/10;
			}			
		
		return OddSum;

		}




}
class Assign7
{
	public static void main(String agrs[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number:--");	

		 int Num1=obj.nextInt();
		Demo2 obj2=new Demo2();
		
		System.out.println("Accept One Number From User And Count Number of Digit");
		obj2.fun15(Num1);
		System.out.println();
		
		
	System.out.println("Accept One Number From User And Sum of Digit in Given Number");		
		obj2.fun16();
		System.out.println();
				

		
		Demo3 obj3=new Demo3();
		System.out.println("Accept One Number Display Differnce Between Even And Odd Number");	
		obj3.fun17();
		System.out.println();
		

		System.out.println("Accept One Number Display Generic Root Of That Number");
		Demo4 obj4=new Demo4();
		obj4.fun18();
		System.out.println();
		

		Demo5 obj5=new Demo5();
		System.out.println("Accept One number And Check That Number is Strong Number or Not");
		System.out.println("Enter Number To Check Strong Number Or Not:--");
		int Strong=obj.nextInt();
		obj5.fun19(Strong);	
		obj5.fun15(11);
		System.out.println();
		
		System.out.println("Accept Two Number From User Calculate the Power");

		System.out.println("Enter First Number:--");			
		int N1=obj.nextInt();
		System.out.println("Enter Second Number:--");
		int N2=obj.nextInt();
		Digit obj6=new Digit();
		int Ret=obj6.fun20(N1,N2);
		System.out.println("Power is:-"+Ret);
		System.out.println();

System.out.println("Accept One Number From User Check That Number is Armstrong Number Or Not");
		System.out.println("Enter Number To check The Armstrong Or Not");	
		
		int Number=obj.nextInt();
		obj6.fun21(Number);	
		System.out.println();
	
	System.out.println("Accept One Number From User And Calculate Maltiplication of Each Digit ");
		int Number2=obj.nextInt();
		int Ret2=obj6.fun22(Number2);	
		System.out.println("Multiplication Of Digit:-"+Ret2);
		System.out.println();

	System.out.println("Accept One Number From User And Display The Additon of Even Number");
		int Number3=obj.nextInt();
		int Ret3=obj6.fun23(Number3);
		System.out.println("Addition Of Even Number:-"+Ret3);
		System.out.println();
	
	System.out.println("Accept One Number From User And Count The Occarances of 5");
		int Number4=obj.nextInt();
		int Ret4=obj6.fun24(Number4);
		System.out.println("Occurances Of 5:-"+Ret4);
		System.out.println();
	
	
	System.out.println("Accept One Number From User And Reverese That Number");
		int Number5=obj.nextInt();
		obj6.fun25(Number5);
		System.out.println();
	
	
	System.out.println("Accept One Number From User Display The Addition of Odd Digit");
		int Number6=obj.nextInt();
		int Ret5=obj6.fun26(Number6);
		System.out.println("Addition Of Odd DigitL:--"+Ret5);
		System.out.println();
	


	}


}
