import java.util.*;
import java.lang.*;
import java.io.*;
class Demo
{
	void fun31(int Brr1[])
	{		if(Brr1==null)
			{
				System.out.println("There Is no Element In The Array");
			
			}
				
			try  
			{
				for(int i=0;i<Brr1.length;i++)
				{
					if(Brr1[i]%3==0)
					{
						Brr1[i]=Brr1[i]+1;
					}
					if(((Brr1[i]%3)==0)&&((Brr1[i]%5)==0))
					{
					Brr1[i]=Brr1[i]+2;
					}
				}
	
			}

		
		
			catch (ArrayIndexOutOfBoundsException exe)
			{
				exe.printStackTrace();
	
			} 
	
			finally
			{	
				System.out.println("After Replcing Elements");
					for(int i=0;i<Brr1.length;i++)
				{
					System.out.println(Brr1[i]);
				}
			}
	}



	public void fun32(int Brr2[])
	{
		if(Brr2==null)
		{
			System.out.println("There Is No Elements In Array");
		}
		int i=0;
			
		try
		{
			for(i=0;i<Brr2.length;i++)
			{
				if((Brr2[i]%2)==0)
				{
					Brr2[i]=1;

				}
				else
				{
					Brr2[i]=0;
				}
			}
		}

			catch (ArrayIndexOutOfBoundsException exe)
			{
				System.out.println(exe);	

			}

			finally
			{
				System.out.println("After Replacing The Array Elements");
				for(i=0;i<Brr2.length;i++)
				{

					System.out.println(Brr2[i]);
				}

			}

	}
		
		void fun33(int Brr3[],int OneNumber)
		{
				if(Brr3==null)
				{
					System.out.println("There Is No Elements In The Array");
				}
				if(OneNumber<0)
				{
					OneNumber=-OneNumber;
				}

				int i=0;
				try
				{
					System.out.println("Divisible Numbers:--");
					for(i=0;i<Brr3.length;i++)
					{
						if(Brr3[i]%OneNumber==0)
						{
							System.out.println(Brr3[i]);
						}
					
					}			
				}

				catch (ArrayIndexOutOfBoundsException exe)
				{
					System.out.println(exe);

				}
		}


		void fun34(int Brr4[])
		{
				if(Brr4==null)
				{
					System.out.println("There Is No Elements In The Array");
				}
				int i=0;
				int Digit=0;
				int Rev=0;
				int Temp=0;
				try
				{
					for(i=0;i<Brr4.length;i++)
					{	
					Temp=Brr4[i];
					while(Brr4[i]!=0)
					{
						Digit=Brr4[i]%10;
						Rev=Rev*10+Digit;
						Brr4[i]=Brr4[i]/10;						

					}

					System.out.println("Reverse Order OF"+ Temp +" "+" Is:-" +Rev);
					Rev=0;
					}			
				}

				catch (ArrayIndexOutOfBoundsException exe)
				{
					System.out.println(exe);

				}
		}


			void fun35(int Brr5[])
		{
				if(Brr5==null)
				{
					System.out.println("There Is No Elements In The Array");
				}
				int i=0;
				int Digit=0;
				int Sum=0;
				int Temp=0;
				try
				{
					for(i=0;i<Brr5.length;i++)
					{	
					Temp=Brr5[i];
					while(Brr5[i]!=0)
					{
						Digit=Brr5[i]%10;
						Sum+=Digit;
						Brr5[i]=Brr5[i]/10;						

					}

					System.out.println("Reverse Order OF"+ Temp +" "+" Is:-" +Sum);
					Sum=0;
					}			
				}

				catch (ArrayIndexOutOfBoundsException exe)
				{
					System.out.println(exe);

				}
		}

		
		void fun36(int Brr6[],int Brr7[])
		{
				if((Brr6==null)||(Brr7==null))
				{
					System.out.println("There Is No Elements In The Array");
				}
				if(Brr6.length!=Brr7.length)
				{
				System.out.println("Enter Both Array Number Of Elements are Same");
		
				}
							
				int i=0;
				try
				{
					for(i=0;i<Brr6.length;i++)
					{	
						if(Brr6[i]!=Brr7[i])
						{
							break;
		
						}
					}		

				}

				catch (ArrayIndexOutOfBoundsException exe)
				{
					System.out.println(exe);

				}
				
					
					if(i>=Brr6.length-1)	
					{
					System.out.println("Both Array Are Same");
					}
					else 
					{
	
					System.out.println("Both Array Are Not Same");
					}
						
			}


		public void fun37(int Brr8[],int Brr9[])
		{
			if((Brr8==null)||(Brr9==null))
			{
			System.out.println("There Is No Element in The Array");
			}
			int i=0;
			int j=0;
		
			try
			{
				for(i=0;i<Brr8.length;i++)
				{}
				
				for(j=0;j<Brr9.length;j++)
				{
				Brr8[i]=Brr9[j];
				i++;
				}
			}	
			catch (ArrayIndexOutOfBoundsException exe)
			{
				exe.printStackTrace();
			}

			finally
			{			
				System.out.println("After Concating The Second Array into First Array");
				for(int k=0;k<Brr8.length;k++)
				{	
				System.out.println(Brr8[k]);
				}
			}		
			
		}

			int fun38(int Brr10[],int Brr11[])
		{
			if((Brr10==null)||(Brr11==null))
			{
			System.out.println("There Is No Element in The Array");
			}
			int i=0;
			int j=0;
			int Sum1=0;
			int Sum2=0;
			try
			{	for(i=0;i<Brr10.length;i++)
				{
					Sum1+=Brr10[i];
				}
				for(j=0;j<Brr11.length;j++)
				{
					Sum2+=Brr11[j];
				}
				
			}	
			catch (ArrayIndexOutOfBoundsException exe)
			{
				exe.printStackTrace();
			}

			finally
			{			
				return Sum1-Sum2;
			}		
			
		}

		void fun39(int Brr12[])
		{
			if(Brr12==null)	
			{
				System.out.println("There Is No Element in The Array");

			}

			int i=0;
			int j=Brr12.length-1;
			
			try
			{			
				while(i<=j)
				{
					if(Brr12[i]!=Brr12[j])
					{
						break;		
					}
					i++;
					j--;
				}	
			}
			catch (Exception exe)
			{
				exe.printStackTrace();
			}
				
			finally
			{
				if(i>=j)
				{
					System.out.println("Given Array Is Palindrome");		
				
				}
				else
				{
					System.out.println("Given Array Is Not-Palindrome");
				}

			}

		}
		
		void fun40(int Brr13[])
		{
			if(Brr13==null)
			{
				System.out.println("There Is No Element In the Array");
			
			}	
			int i=0;
			int j=0;
			for(i=0;i<Brr13.length;i++)
			{
				for(j=0;j<Brr13[i];j++)
				{
				System.out.printf("*\t");
				}
			System.out.println();
			}
			
		
		}
		void fun41(float Per)
		{
			if(Per<0)
			{
				Per=-Per;
			}
				if(Per<35)
				{
	
					System.out.println("Student Fail");
				}
				else if((Per>35)&&(Per<50))
				{
					System.out.println("Student Pass");
				}
				else if((Per>50)&&(Per<60))
				{
					System.out.println("Student Pass With Second Class");
				}
				else if((Per>60)&&(Per<70))
				{
					System.out.println("Student Pass With First Class");
				}
				else
				{

					System.out.println("Student Pass First Class With Distinction");
				}

		}

}



class Assign9
{

	public static void main(String args[])throws Exception
	{

		Scanner Sc=new Scanner(System.in);

		System.out.println("Enter The Number of Elements For Array");	
		int No=Sc.nextInt();	
	
		int Brr1[]=new int[No];

		System.out.println("Accept Array From User and Increase the Elements if Its Divisible by 3|Increase if It Divisible by 3 As Well 5");
		System.out.println("Enter Elements For Array:--");
		for(int i=0;i<No;i++)
		{

			Brr1[i]=Sc.nextInt();
		}
		Demo obj=new Demo();
		obj.fun31(Brr1);
		System.out.println();


		System.out.println("Accept Array From User and Replace Each Number with 1 And Odd Number With 0");
		System.out.println("Enter The Number of Elements For Array:--");	
		No=Sc.nextInt();	
		System.out.println("Enter Elements For Array:--");
		
		int Brr2[]=new int[No];

		for(int i=0;i<No;i++)
		{

			Brr2[i]=Sc.nextInt();
		}
		obj.fun32(Brr2);
		System.out.println();


		System.out.println("Accept The Arrray From User As Well one Number And Diplay ALl the Divisible of That Number");
		System.out.println("Enter Number Of Element For The Array:--");
		No=Sc.nextInt();
		
		System.out.println("Enter Array Elements:--");
		
		int Brr3[]=new int[No];
			
		for(int i=0;i<No;i++)
		{
			Brr3[i]=Sc.nextInt();
		}	
		System.out.println("Enter One Number To check The Divisibility:--");
		int OneNumber=Sc.nextInt();
		
		obj.fun33(Brr3,OneNumber);
		System.out.println();

		System.out.println("Accept Array From User and Replace Each Number At that Places");
		System.out.println("Enter The Number of Elements For Array:--");	
		No=Sc.nextInt();	
		System.out.println("Enter Elements For Array:--");
		
		int Brr4[]=new int[No];

		for(int i=0;i<No;i++)
		{

			Brr4[i]=Sc.nextInt();
		}
		obj.fun34(Brr4);
		System.out.println();

		System.out.println("Accept Array From User and Replace Each Number With That Digit Addition");
		System.out.println("Enter The Number of Elements For Array:--");	
		No=Sc.nextInt();	
		System.out.println("Enter Elements For Array:--");
		
		int Brr5[]=new int[No];

		for(int i=0;i<No;i++)
		{

			Brr5[i]=Sc.nextInt();
		}
		obj.fun35(Brr5);
		System.out.println();


		System.out.println("Accept Two Array From User and Check Both Array Is Equal Or Not");
		System.out.println("Enter The Number of Elements For FirstArray:--");	
		int No1=Sc.nextInt();	
		
		System.out.println("Enter Elements For FirstArray:--");
		
		int Brr6[]=new int[No];

		for(int i=0;i<No1;i++)
		{

			Brr6[i]=Sc.nextInt();
		}
		
		System.out.println("Enter The Number of Elements For SecondArray:--");	
		int No2=Sc.nextInt();	
		System.out.println("Enter Elements For SecondArrays:--");
		
		int Brr7[]=new int[No2];

		for(int i=0;i<No2;i++)
		{

			Brr7[i]=Sc.nextInt();
		}
		obj.fun36(Brr6,Brr7);
		System.out.println();

		
		System.out.println("Accept Two Array From User and Concat First Array inot Second Array");
		System.out.println("Enter The Number of Elements For FirstArray:--");	
		 No1=Sc.nextInt();	
		int Brr8[]=new int[No1];
		System.out.println("Enter The Elements For FirstArray:--");

			for(int i=0;i<No1;i++)
			{
				Brr8[i]=Sc.nextInt();
			}
		

		System.out.println("Enter The Number of Elements For SecondArray:--");	
		 No2=Sc.nextInt();	
		int Brr9[]=new int[No2];
		System.out.println("Enter The Elements For SecondArray");
		for(int j=0;j<No2;j++)
		{
			Brr9[j]=Sc.nextInt();
		}	

		obj.fun37(Brr8,Brr9);
		System.out.println();

		System.out.println("Accept Two Array From User and Display the Differnce Between Both Array");
		System.out.println("Enter The Number of Elements For FirstArray:--");	
		 No1=Sc.nextInt();	
		int Brr10[]=new int[No1];
		System.out.println("Enter The Elements For FirstArray:--");

			for(int i=0;i<No1;i++)
			{
				Brr10[i]=Sc.nextInt();
			}
		

		System.out.println("Enter The Number of Elements For SecondArray:--");	
		 No2=Sc.nextInt();	
		int Brr11[]=new int[No2];
		System.out.println("Enter The Elements For SecondArray");
		for(int j=0;j<No2;j++)
		{
			Brr11[j]=Sc.nextInt();
		}	

		int Ret=obj.fun38(Brr10,Brr11);
		System.out.println("Difference Between Both Array:-"+Ret);
		System.out.println();


		System.out.println("Accept The Array From User And Check that Array is Palindrome Or Not");	
		int No3=Sc.nextInt();	
	
		int Brr12[]=new int[No3];
		System.out.println("Enter Elements For Array:--");
		for(int i=0;i<No3;i++)
		{

			Brr12[i]=Sc.nextInt();
		
		}
		obj.fun39(Brr12);
		System.out.println();
		
		System.out.println("Patter1:--");
		System.out.println("Enter Number For Array:--");
		int No4=Sc.nextInt();
		int Brr13[]=new int[No4];
		System.out.println("Enter Elements For Array:--");		
		for(int k=0;k<No4;k++)
		{
			Brr13[k]=Sc.nextInt();

		}

	
		obj.fun40(Brr13);
		System.out.println();
	
		System.out.println("Accept The percenated From User Display The Class Of According to Pecentage");
		System.out.println("Enter Percentage");
		float Per=Sc.nextFloat();
		obj.fun41(Per);	
		System.out.println();		
	}
	

}
