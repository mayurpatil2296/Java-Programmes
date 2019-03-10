import java.io.*;
import java.lang.*;

class Demo
{
	void fun41(char Arr1[])
	{
		if(Arr1==null)
		{
			System.out.println("There Is No Element in The Array");
		}
		for(int i=0;i<Arr1.length;i++)
		{
			if((Arr1[i]>=65)&&(Arr1[i]<=97))
			{
				System.out.println(Arr1[i]);
			}

		}
			
	}

	void fun42(char Arr2[])
	{
		if(Arr2==null)
		{
			System.out.println("There Is No Element in The Array");
		}
		for(int i=0;i<Arr2.length;i++)
		{
			if((Arr2[i]>='a')&&(Arr2[i]<='z'))
			{
				System.out.println(Arr2[i]);
			}

		}
			

	}

	void fun43(char Arr3[])
	{
		if(Arr3==null)
		{
			System.out.println("There Is No Element in The Array");
		}
		try
		{
		for(int i=0;i<Arr3.length;i++)
		{
			if((Arr3[i]>='a')&&(Arr3[i]<='z'))
			{
				Arr3[i]+=32;				
			}

		}
		}
		catch (Exception ee)
		{
			ee.printStackTrace();
		}
		finally
		{		
			System.out.println("After Replacing the Character With UpperCase Letter");
			for(int j=0;j<Arr3.length;j++)
			{
				System.out.println(Arr3[j]);		
			}
		}
				
	}

		
	int fun44(char Arr4[])
	{
		if(Arr4==null)
		{
			System.out.println("There Is No Element in The Array");
		}
		int UpperCount=0;
		int LowerCount=0;
		try
		{
		for(int i=0;i<Arr4.length;i++)
		{
			if((Arr4[i]>='A')&&(Arr4[i]<='Z'))
			{
				UpperCount++;				
			}
			else
			{
				LowerCount++;
			}

		}
		}
		catch (Exception ee)
		{
			ee.printStackTrace();
		}
		finally
		{		
			int Diff=UpperCount-LowerCount;
			return Diff;			
		}
	}

		void fun45()
		{
			 char i=0;
			for(i=0;i<=256;i++)
			{
			System.out.println((char)i);
			
			}
				
		}

		void fun46(char ch)
		{
			if((ch>='A')&&(ch<='Z'))
			{
				System.out.println("Given Charcater is Uppercase");
			}

			else if((ch>='a')&&(ch<='z'))
			{
				System.out.println("Given Charcater is LowerCase");
			}
			else if((ch>='0')&&(ch<='9'))
			{
				System.out.println("Given Charcater is Digit");
			}
		}
		
		void fun47(char ch2)
		{
			if((ch2=='A')||(ch2=='a'))
			{
				System.out.println("Your Exam is At 7AM");
			}
			else if((ch2=='B')||(ch2=='b'))
			{
				System.out.println("Your Exam is At 8:15AM");
			}
			if((ch2=='C')||(ch2=='c'))
			{
				System.out.println("Your Exam is At 9AM");
			}
			else if((ch2=='D')||(ch2=='d'))
			{
				System.out.println("Your Exam is At 11AM");
			}
			else
			{
				System.out.println("Wrong Division!");
			}
		}
			
		void fun48(char ch1,char ch2)
		{
			char Temp;
			if((ch1=='A')&&(ch1=='a')&&(ch2>='A')&&(ch2<='Z'))
			{	
				System.out.println("Before--Swapping");
				System.out.println("charcater First:--"+ch1);
				System.out.println("charcater Second:--"+ch2);
				Temp=ch1;
				ch1=ch2;
				ch2=Temp;
				System.out.println("After--Swapping");
				System.out.println("charcater First:--"+ch1);
				System.out.println("charcater second:--"+ch2);
			}
			else if((ch1=='a')&&(ch1=='z')&&(ch2>='a')&&(ch2<='z'))
			{	
				System.out.println("Before--Swapping");
				System.out.println("charcater First:--"+ch1);
				System.out.println("charcater Second:--"+ch2);
				Temp=ch1;
				ch1=ch2;
				ch2=Temp;
				System.out.println("After--Swapping");
				System.out.println("charcater First:--"+ch1);
				System.out.println("charcater second:--"+ch2);
				
			}
			else
			{
				System.out.println("charcater First:--"+ch1);
				System.out.println("charcater second:--"+ch2);
				
		
			}
			
		}
			void fun49(char ch3)throws Exception
			{
					int no=65;
				System.out.printf("Decimal-Format:-%d\n",no);
				System.out.printf("Octal-Format:-%o\n",no);
				System.out.printf("HexaDecimal Format:-%X\n",no);
		
			}	
			


}




class Assign11
{
	public static void main(String args[])throws Exception
	{
		InputStreamReader SF=new InputStreamReader(System.in);
		BufferedReader BF=new BufferedReader(SF);
		
		
		int Choice=0;
		Demo obj=new Demo();			
		
		while(true)
		{
			System.out.println("Enter Choice:--");
			 Choice=Integer.parseInt(BF.readLine());

		
			switch(Choice)
			{
			case 1:
			System.out.println("Accept Character From User Display The Uppercase Letter OF Array:--");
			System.out.println("Enter Number Of Elments For Array:--");
			int No1=Integer.parseInt(BF.readLine());
	
			char Arr1[]=new char[No1];
			System.out.println("Enter The Elements For Array:--");
			for(int i=0;i<No1;i++)
			{
				Arr1[i]=(char)BF.read();	
			}	
			System.out.println("UpperCase Character In Array:--");
			obj.fun41(Arr1);
			break;
			
			case 2:
			System.out.println("Accept Character From User Display The Lowercase Letter OF Array:--");
			System.out.println("Enter Number Of Elments For Array:--");
			int No2=Integer.parseInt(BF.readLine());
	
			char Arr2[]=new char[No2];
			System.out.println("Enter The Elements For Array:--");
			for(int i=0;i<No2;i++)
			{
				Arr2[i]=(char)BF.read();	
			}	
			System.out.println("LowerCase Character In Array:--");
			obj.fun42(Arr2);
			break;
			
			case 3:
			System.out.println("Accept Character From User And replace The Uppercase Letter With LowerCase OF Array:--");
			System.out.println("Enter Number Of Elements For Array:--");
			int No3=Integer.parseInt(BF.readLine());
	
			char Arr3[]=new char[No3];
			System.out.println("Enter The Elements For Array:--");
			for(int i=0;i<No3;i++)
			{
				Arr3[i]=(char)BF.read();	
			}	
			obj.fun43(Arr3);
			break;
						
			case 4:
			System.out.println("Accept Character From User And Display The Difference Between the UpperCase And LowerCase Letters:--");
			System.out.println("Enter Number Of Elments For Array:--");
			int No4=Integer.parseInt(BF.readLine());
	
			char Arr4[]=new char[No4];
			System.out.println("Enter The Elements For Array:--");
			for(int i=0;i<No4;i++)
			{
				Arr4[i]=(char)BF.read();	
			}	
			
			int Diff=obj.fun44(Arr4);
			System.out.println("Differnce Between LowerCase And UppeCase Letter:-"+Diff);
			break;
			

			case 5:
			System.out.println("ASCII Tabel:--");
			obj.fun45();
			break;
				
			case 6:
			System.out.println("Accept One Character From User Display That Case");
			System.out.println("Enter Character to Check the Case");			
			char ch=(char)BF.read();
			obj.fun46(ch);
			break;				

			case 7:
			System.out.println("Accept Division i.e(A,B,C,D) From User Display The Timing According Division");
			System.out.println("Enter Character to Check Division");			
			char ch2=(char)BF.read();
			obj.fun47(ch2);
			break;
			
			case 8:
			System.out.println("Accept Two Character From User And Swap Both Character If Charcater is Uppercase|Lower");	
			System.out.println("Enter First character");	
			char ch1=(char)BF.read();
			System.out.flush();			
			System.out.println("Enter Second Character");
			//flush.System.in;
			ch2=(char)BF.read();
			obj.fun48(ch1,ch2);
			break;
		
			case 9:
			System.out.println("Accept Character From user And Display That Character Decimal Value,Octal Value,HexaDecimal Value");
			char ch3=(char)BF.read();
			obj.fun49(ch3);
			break;
			
			case 0:
			break;		
			
			default:
			System.out.println("Wrong Choice");			
					
			break;
				
			}
		}					
			
	}

}
