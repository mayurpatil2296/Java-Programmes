import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{	
		void fun56(int Num1)
		{
		int i=0;
			for(i=65;i<65+Num1;i++)
			{
				System.out.println((char)i);
			
			}
		}



		void fun57(int Num2,int Num3)
		{
		if(Num2<0)
		{
		Num2=-Num2;
		}
		if(Num3<0)
		{
			Num3=-Num3;
		}
		
		for(int i=1;i<=Num2;i++)
		{
			for(int j=1;j<=Num3;j++)
			{			
				System.out.printf("*\t");
			}
			System.out.println();
	
		}
	
		}

		
		void fun58(int Num4,int Num5)
		{
		if(Num4<0)
		{
		Num4=-Num4;
		}
		if(Num5<0)
		{
			Num5=-Num5;
		}
		
		for(int i=1;i<=Num4;i++)
		{
			for(int j=1;j<=Num5;j++)
			{			
				System.out.printf("%d\t",j);
			}
			System.out.println();
	
		}
	
		}


		void fun59(int Num6,int Num7)
		{
		if(Num6<0)
		{
		Num6=-Num6;
		}
		if(Num7<0)
		{
			Num7=-Num7;
		}
		
		for(int i=1;i<=Num6;i++)
		{
			for(int j=1;j<=Num7;j++)
			{			
				if((j==2)||(j==4))
				{
				System.out.printf("$\t");
		
				}		
				else
				{
				System.out.printf("%d\t",j);
				}		
	
			}
			System.out.println();
	
		}
	
		}

		void fun60(int Num8,int Num9)
		{
		if(Num8<0)
		{
		Num8=-Num8;
		}
		if(Num9<0)
		{
			Num9=-Num9;
		}
		
		for(int i=1;i<=Num8;i++)
		{
			for(int j=1;j<=Num9-2;j++)
			{			
				System.out.printf("%d\t$\t",j);
			
			}
			System.out.println();
	
		}
	
		}
		void fun61(int Num10,int Num11)
		{
		if(Num10<0)
		{
		Num10=-Num10;
		}
		if(Num11<0)
		{
			Num11=-Num11;
		}
		
		for(int i=1;i<=Num10;i++)
		{
			for(int j=1;j<=i;j++)
			{			
				System.out.printf("*\t");
			
			}
			System.out.println();
	
		}
	
		}

		void fun62(int Num12,int Num13)
		{
		if(Num12<0)
		{
		Num12=-Num12;
		}
		if(Num13<0)
		{
			Num13=-Num13;
		}
		
		for(int i=Num12;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{			
				System.out.printf("*\t");
			
			}
			System.out.println();
	
		}
	
		}

		void fun63(int Num14,int Num15)
		{
		if(Num14<0)
		{
		Num14=-Num14;
		}
		if(Num15<0)
		{
			Num15=-Num15;
		}
		
		for(int i=1;i<=Num14;i++)
		{
			for(int j=1;j<=Num15;j++)
			{			
				if((i==1)||(j==1)||(i==Num14)||(j==Num15))
				{
					System.out.printf("%d\t",j);
				}	
				else
				{
					System.out.printf("#\t");
			
				}
			}
			System.out.println();
		}
		}

		void fun64(String Str)
		{
			int Count=Str.length();
			for(int i=1;i<=Count;i++)
			{
				for(int j=0;j<Count;j++)
				{
										
					System.out.printf("%c\t",Str.charAt(j));
				}
			System.out.println();
			}

		}

		void fun65(String Str2)
		{
			int Count=Str2.length();
			for(int i=1;i<=Count;i++)
			{
				for(int j=0;j<i;j++)
				{
										
					System.out.printf("%c\t",Str2.charAt(j));
				}
			System.out.println();
			}

		}
	
		void fun66(String Str3)
		{
			int Count=Str3.length();
			for(int i=Count;i>=0;i--)
			{
				for(int j=0;j<i;j++)
				{
										
					System.out.printf("%c\t",Str3.charAt(j));
				}
			System.out.println();
			}

		}
	
		void fun67(String Str4)
		{
			int Count=Str4.length();
			for(int i=0;i<Count;i++)
			{
				for(int j=0;j<Count;j++)
				{
					if((i==0)||(j==0)||(i==Count-1)||(j==Count-1))
					{					
					System.out.printf("%c\t",Str4.charAt(j));
					}
					else
					{
					System.out.println("$\t");
					}				
				}
			System.out.println();
			}		
		}

		void fun68(int Num16)
		{
			if(Num16<0)
			{
				Num16=-Num16;
			}
			int Digit=0;
			int Temp=Num16;
			int Temp2=Num16;
			int Cnt=0;
			while(Temp!=0)
			{
				Cnt++;
				Temp=Temp/10;
			}

				for(int i=1;i<=Cnt;i++)
				{
					while(Num16!=0)
					{					
						Digit=Num16%10;
						for(int j=1;j<=1;j++)
						{
							System.out.printf("%d\t",Digit);

						}
						Num16=Num16/10;
					}	
					Num16=Temp2;
					System.out.println();
				}
		
		}

			void fun69(int Num17)
			{
			if(Num17<0)
			{
				Num17=-Num17;
			}
			int Digit=0;
			int Temp=Num17;
			int Temp2=Num17;
			int Cnt=0;
			while(Temp!=0)
			{
				Cnt++;
				Temp=Temp/10;
			}

				for(int i=1;i<=Cnt;i++)
				{
					for(int j=1;j<=i;j++)
					{	
						while(Num17!=0)
						{
							Digit=Num17%10;
							if(j<=i)
							{
								System.out.printf("%d\t",Digit);
							}
							Num17=Num17/10;	
							j++;
						}
					
					}	
					Num17=Temp2;			
					System.out.println();			

				}
	
			}
	
			void fun70(int Num18)
			{
			if(Num18<0)
			{
				Num18=-Num18;
			}
			int Digit=0;
			int Temp=Num18;
			int Temp2=Num18;
			int Cnt=0;
		
			while(Temp!=0)
			{
				Cnt++;
				Temp=Temp/10;
			}

				for(int i=Cnt;i>=1;i--)
				{
					for(int j=1;j<=1;j++)
					{
						while(Num18!=0)
						{
							Digit=Num18%10;
							if(j<=i)
							{
								System.out.printf("%d\t",Digit);				
							}						
							Num18=Num18/10;
							j++;
						}
						Num18=Num18/10;					
				
					}
					Num18=Temp2;
					System.out.println();
					
				}
	
			}

			void fun71(int Num19)
			{
				if(Num19<0)
				{
					Num19=-Num19;
				}

				int Temp=Num19;
				int Cnt=0;
				int Digit=0;
				int Temp2=Num19;
				while(Temp!=0)
				{
					Cnt++;
					Temp=Temp/10;
				}

					for(int i=1;i<=Cnt;i++)
					{
						while(Num19!=0)
						{
						Digit=Num19%10;
							for(int j=1;j<=1;j++)
							{
								if((i==1)||(j==1)||(i==Cnt)||(j==Cnt))
								{
									System.out.printf("%d\t",Digit);
								}
								else
								{
									System.out.printf("*\t");	
								}
			
							}
						Num19=Num19/10;
						}
						Num19=Temp2;
						System.out.println();
					}

			}
		
		void fun72(int Num20,int Num21)
		{
			if(Num20<0)
			{
				Num20=-Num20;

			}
		
			if(Num21<0)
			{
				Num21=-Num21;

			}

			int i,j;
			
				for(i=1;i<=Num20;i++)
				{
					for(j=65;j<=65+Num21;j++)
					{
						System.out.printf("%c\t",j);
					}
					System.out.println();
				}		
		}


		void fun73(int Num22,int Num23)
		{
			if(Num22<0)
			{
				Num22=-Num22;

			}
		
			if(Num23<0)
			{
				Num23=-Num23;

			}

			int i,j;
			
				for(i=1;i<=Num22;i++)
				{
					for(j=1;j<=Num23;j++)
					{
						System.out.printf("%d\t",i);
					}
					System.out.println();
				}		
		
		}
		void fun74(int Num24,int Num25)
		{
			if(Num24<0)
			{
				Num24=-Num24;

			}
		
			if(Num25<0)
			{
				Num25=-Num25;

			}

			int i,j;
			
				for(i=1;i<=Num24;i++)
				{
					for(j=1;j<=Num25;j++)
					{
						if(i==j)
						{
						System.out.printf("@\t");
						}
					else if(i>j)
						{
						System.out.printf("$\t");
						}	
					else if(i<j)
						{
						System.out.printf("#\t");
						}
						else
						{

						System.out.printf("%d\t",j);
						}
					}
					System.out.println();
				}		
		
		}

		void fun75(int Arr1[])
		{
			if(Arr1==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr1.length;
			
			for(int i=0;i<Cnt;i++)
			{
				for(int j=0;j<Cnt;j++)
				{
					System.out.printf("%d\t",Arr1[j]);
				}
				System.out.println();
			}

		}

		void fun76(int Arr2[])
		{
			if(Arr2==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr2.length;
			
			for(int i=0;i<Cnt;i++)
			{
				for(int j=0;j<i;j++)
				{
					System.out.printf("%d\t",Arr2[j]);
				}
				System.out.println();
			}

		}

		void fun77(int Arr3[])
		{
			if(Arr3==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr3.length;
			
			for(int i=Cnt;i>=0;i--)
			{
				for(int j=0;j<i;j++)
				{
					System.out.printf("%d\t",Arr3[j]);
				}
				System.out.println();
			}

		}
		
		void fun78(int Arr4[])
		{
			if(Arr4==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr4.length;
			
			try
			{
			for(int i=1;i<=Cnt;i++)
			{
				if((i==2)||(i==4))
				{
					for(int j=Cnt-1;j>=0;j--)
					{
						System.out.printf("%d\t",Arr4[j]);
					}
				}	
				else
				{
					for(int j=0;j<=Cnt-1;j++)
					{
						System.out.printf("%d\t",Arr4[j]);
					}
			
				}
			System.out.print("\n");			

			}
			}
			catch(ArrayIndexOutOfBoundsException ee)
			{
				ee.printStackTrace();
			}		
		
		}

		void fun79(int Arr5[])
		{
			if(Arr5==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr5.length;
			
			for(int i=0;i<Cnt;i++)
			{
				for(int j=0;j<Cnt;j++)
				{
					if(i>j)
					{
						System.out.printf("00\t");
					}					
					else
					{
						System.out.printf("%d\t",Arr5[j]);
					}	
	
				}
				System.out.println();
			}

		}

		void fun80(int Arr6[])
		{
			if(Arr6==null)
			{
			System.out.println("There is No Elements in Array");
			}
			
			int Cnt=Arr6.length;
			
			for(int i=0;i<Cnt;i++)
			{
				for(int j=0;j<Cnt;j++)
				{
					System.out.printf("%d\t",Arr6[i]);	
	
				}
				System.out.println();
			}

		}
		void fun81(int Arr7[])
		{
			if(Arr7==null)
			{
				System.out.println("There is No Elements in Array");
			}
			int Digit=0;
			int Sum=0;
			System.out.println("Before Array:--");
			for(int j=0;j<Arr7.length;j++)
			{
				System.out.println(Arr7[j]);
			
			}
				for(int i=0;i<Arr7.length;i++)
				{
					while(Arr7[i]!=0)
					{
						Digit=Arr7[i]%10;
						Sum+=Digit;
						Arr7[i]=Arr7[i]/10;
					}
					Arr7[i]=Sum;
					Sum=0;
				}
			int Cnt=Arr7.length;
			System.out.println("After Calculating The Digit Sum In Array");
			System.out.println("Pattern26:--");	
				for(int i=0;i<Cnt;i++)
				{
					for(int j=0;j<Cnt;j++)
					{
						System.out.printf("%d\t",Arr7[j]);
					}
				System.out.println();
				}		
		}

		void fun82(int Arr8[])
		{
			if(Arr8==null)
			{
				System.out.println("There is No Elements in Array");
			}
			int Digit=0;
			int Rev=0;
			System.out.println("Before Array:--");
			for(int j=0;j<Arr8.length;j++)
			{
				System.out.println(Arr8[j]);
			
			}
				for(int i=0;i<Arr8.length;i++)
				{
					while(Arr8[i]!=0)
					{
						Digit=Arr8[i]%10;
						Rev=Rev*10+Digit;
						Arr8[i]=Arr8[i]/10;
					}
					Arr8[i]=Rev;
					Rev=0;
				}
			int Cnt=Arr8.length;
			System.out.println("After Reversing The Elements In Array");
			System.out.println("Pattern27:--");	
				for(int i=0;i<Cnt;i++)
				{
					for(int j=0;j<Cnt;j++)
					{
						System.out.printf("%d\t",Arr8[j]);
					}
				System.out.println();
				}		
			}

				
		void fun83(int Arr9[])
		{
			if(Arr9==null)
			{
				System.out.println("There is No Elements in Array");
			}
			int Cnt=Arr9.length;	
			
				for(int i=0;i<Arr9.length;i++)
				{
					for(int j=0;j<Cnt;j++)
					{	
						if(Arr9[j]%2==0)
						{
						System.out.printf("%d\t",Arr9[j]);
						}
					}
					System.out.println();
				}		
			

		}






}




class Assign13
{
	public static void main(String args[])throws Exception
	{
		Scanner SC=new Scanner(System.in);
		int Choice=0;
		BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));	
		boolean Data=true;
		Demo obj=new Demo();		
		while(Data)
		{
		System.out.println("Enter Choice:--");
		Choice=SC.nextInt();
		
		switch(Choice)
		{
		case 1:
		System.out.println("Accept One Number From user And Display The Character Still That Number");
		System.out.println("Enter The Number:--");		
		int Num1=SC.nextInt();
		obj.fun56(Num1);
		System.out.println();
		break;
		
		case 2:		
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num2=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num3=SC.nextInt();
		System.out.println("Pattern2:--");
		obj.fun57(Num2,Num3);		
		System.out.println();
		break;
		
		case 3:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num4=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num5=SC.nextInt();
		System.out.println("Pattern3:--");
		obj.fun58(Num4,Num5);		
		System.out.println();
		break;
		
		case 4:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num6=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num7=SC.nextInt();
		System.out.println("Pattern4:--");
		obj.fun59(Num6,Num7);		
		System.out.println();
		break;
		
		case 5:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num8=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num9=SC.nextInt();
		System.out.println("Pattern5:--");
		obj.fun60(Num8,Num9);		
		System.out.println();
		break;

		case 6:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num10=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num11=SC.nextInt();
		System.out.println("Pattern6:--");
		obj.fun61(Num10,Num11);		
		System.out.println();
		break;

		case 7:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num12=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num13=SC.nextInt();
		System.out.println("Pattern7:--");
		obj.fun62(Num12,Num13);		
		System.out.println();
		break;
		
		case 8:
		System.out.println("Accept The Two Number From User and Display Pattern");
		System.out.println("Enter First Character:--");	
		int Num14=SC.nextInt();
		System.out.println("Enter Second Character:--");
		int Num15=SC.nextInt();
		System.out.println("Pattern8:--");
		obj.fun63(Num14,Num15);		
		System.out.println();
		break;

		case 9:
		System.out.println("Accept String From User And Display the Pattern:--");
		System.out.println("Enter String:--");
		String Str=BF.readLine();
		System.out.println("Pattern9:--");
		obj.fun64(Str);
		System.out.println();		

		case 10:
		System.out.println("Accept String From User And Display the Pattern:--");
		System.out.println("Enter String:--");
		String Str2=BF.readLine();
		System.out.println("Pattern10:--");
		obj.fun65(Str2);
		System.out.println();		
				
		case 11:
		System.out.println("Accept String From User And Display the Pattern:--");
		System.out.println("Enter String:--");
		String Str3=BF.readLine();
		System.out.println("Pattern11:--");
		obj.fun66(Str3);
		System.out.println();		
		
		case 12:
		System.out.println("Accept String From User And Display the Pattern:--");
		System.out.println("Enter String:--");
		String Str4=BF.readLine();
		System.out.println("Pattern12:--");
		obj.fun67(Str4);
		System.out.println();		
		
		case 13:
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter Number:--");
		int Num16=SC.nextInt();
		System.out.println("Pattern13:--");
		obj.fun68(Num16);
		System.out.println();

		case 14:
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter Number:--");
		int Num17=SC.nextInt();
		System.out.println("Pattern14:--");
		obj.fun69(Num17);
		System.out.println();
		break;	
	
		case 15:
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter Number:--");
		int Num18=SC.nextInt();
		System.out.println("Pattern15:--");
		obj.fun70(Num18);
		System.out.println();
		break;
		
		case 16:
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter Number:--");
		int Num19=SC.nextInt();
		System.out.println("Pattern16:--");
		obj.fun71(Num19);
		System.out.println();
		break;	
			
		case 17:	
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter FirstNumber:--");
		int Num20=SC.nextInt();
		System.out.println("Enter SecondNumber:--");
		int Num21=SC.nextInt();
		System.out.println("Pattern17:--");
		obj.fun72(Num20,Num21);
		System.out.println();
		break;				
		
		case 18:	
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter FirstNumber:--");
		int Num22=SC.nextInt();
		System.out.println("Enter SecondNumber:--");
		int Num23=SC.nextInt();
		System.out.println("Pattern18:--");
		obj.fun73(Num22,Num23);
		System.out.println();
		break;				
		
		case 19:	
		System.out.println("Accept A Number From User Display Pattern:--");
		System.out.println("Enter FirstNumber:--");
		int Num24=SC.nextInt();
		System.out.println("Enter SecondNumber:--");
		int Num25=SC.nextInt();
		System.out.println("Pattern19:--");
		obj.fun74(Num24,Num25);
		System.out.println();
		break;				
		
		case 20:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num26=SC.nextInt();
		int Arr1[]=new int[Num26];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num26;i++)
		{
			Arr1[i]=SC.nextInt();
		}
		System.out.println("Pattern20:--");
		obj.fun75(Arr1);
		System.out.println();
		break;

		
		case 21:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num27=SC.nextInt();
		int Arr2[]=new int[Num27];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num27;i++)
		{
			Arr2[i]=SC.nextInt();
		}
		System.out.println("Pattern21:--");
		obj.fun76(Arr2);
		System.out.println();
		break;

		case 22:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num28=SC.nextInt();
		int Arr3[]=new int[Num28];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num28;i++)
		{
			Arr3[i]=SC.nextInt();
		}
		System.out.println("Pattern22:--");
		obj.fun77(Arr3);
		System.out.println();
		break;
	
		case 23:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num29=SC.nextInt();
		int Arr4[]=new int[Num29];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num29;i++)
		{
			Arr4[i]=SC.nextInt();
		}
		System.out.println("Pattern23:--");
		obj.fun78(Arr4);
		System.out.println();
		break;
	
		case 24:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num30=SC.nextInt();
		int Arr5[]=new int[Num30];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num30;i++)
		{
			Arr5[i]=SC.nextInt();
		}
		System.out.println("Pattern24:--");
		obj.fun79(Arr5);
		System.out.println();
		break;
			
		case 25:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num31=SC.nextInt();
		int Arr6[]=new int[Num31];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num31;i++)
		{
			Arr6[i]=SC.nextInt();
		}
		System.out.println("Pattern25:--");
		obj.fun80(Arr6);
		System.out.println();
		break;
		
		case 26:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num32=SC.nextInt();
		int Arr7[]=new int[Num32];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num32;i++)
		{
			Arr7[i]=SC.nextInt();
		}
		obj.fun81(Arr7);
		System.out.println();
		break;
		
		case 27:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num33=SC.nextInt();
		int Arr8[]=new int[Num33];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num33;i++)
		{
			Arr8[i]=SC.nextInt();
		}
		obj.fun82(Arr8);
		System.out.println();
		break;
		
		case 28:
		System.out.println("Accept Array From User And Display ArrayPattern:-");
		System.out.println("Enter Number Of Elements For Array:--");
		int Num34=SC.nextInt();
		int Arr9[]=new int[Num34];
		System.out.println("Enter The Elements For Array:--");
		for(int i=0;i<Num34;i++)
		{
			Arr9[i]=SC.nextInt();
		}
		System.out.println("Pattern28:--");
		obj.fun83(Arr9);
		System.out.println();
		break;
		
		case 0:
		Data=false;
		break;
		 
		default:
		System.out.println("Wrong Choice");
		break;
		}
		
		}
	
	}

}
