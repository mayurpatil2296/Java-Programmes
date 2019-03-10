import java.io.*;
class Arr
{
	public void fun21(int Arr1[])
	{
		if(Arr1==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		
		for(int i=0;i<Arr1.length;i++)
		{
			if((Arr1[i]%2)==0)
			{

			System.out.println(Arr1[i]);
	
			}

		}
		
	}


	public int fun22(int Arr2[])
	{
		if(Arr2==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		int Evensum=0;
		for(int i=0;i<Arr2.length;i++)
		{			
			if(Arr2[i]%2==0)
			{
				Evensum+=Arr2[i];

			}
		
		}
		return Evensum;
		
	}

	public void fun23(int Arr3[])
	{
		if(Arr3==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		
		for(int i=Arr3.length-1;i>=0;i--)
		{
			
			System.out.println(Arr3[i]);
		
		}
		
	}


	public void fun24(int Arr4[])
	{
		if(Arr4==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		int Flag=0;
		int Temp=0;		
		for(int i=0;i<Arr4.length;i++)
		{
			Flag=0;
			Temp=Arr4[i];
			for(int j=2;j<=Arr4[i]/2;j++)
			{
				if((Arr4[i]%j)==0)
				{
					Flag=1;
					break;
				
				}
			}


				if(Flag==0)
				{
					System.out.println(Temp);
	
				}
		}
		
	}


		public void fun25(int Arr5[])
	{
		if(Arr5==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		int Count=0;	
		int Temp=0;
		for(int i=0;i<Arr5.length;i++)
		{
				Temp=Arr5[i];
				while(Arr5[i]!=0)
				{
					Count++;
					Arr5[i]=Arr5[i]/10;
		
				}	
			System.out.println("Count Of" +" "+Temp +" "+"Is:--"+Count);
			Count=0;
		
		}
		
	}
	

		public void fun26(int Arr6[])
	{
		if(Arr6==null)
		{
		System.out.println("There is No Elements in The Array");

		}
		int Temp=0;
		int Addsum=0;
		int Digit=0;
		for(int i=0;i<Arr6.length;i++)
		{
				
				Temp=Arr6[i];					
				while(Arr6[i]!=0)
				{
					Digit=Arr6[i]%10;
					Addsum+=Digit;
					Arr6[i]=Arr6[i]/10;
			
				}	
			System.out.println("Sum Of"+" "+Temp+" "+"Is:--"+Addsum);
			Addsum=0;
		
		}
		
	}


		public int fun27(int Arr7[])
		{
			if(Arr7==null)
			{
			System.out.println("There is No Elements in The Array");
	
			}
			int Max=Arr7[0];
			for(int i=0;i<Arr7.length;i++)
			{
				if(Arr7[i]>Max)
				{
					Max=Arr7[i];					
			
				}
						
			}
		return Max;
		
		}

		public int fun28(int Arr8[])
		{	
			if(Arr8==null)
			{
			System.out.println("There is No Elements in The Array");
	
			}
			
			int Min=Arr8[0];
			for(int i=0;i<Arr8.length;i++)
			{
				if(Arr8[i]<Min)
				{
					Min=Arr8[i];					
			
				}
						
			}
		return Min;
		
		}
		
		public void fun29(float Arr9[])
		{	
			if(Arr9==null)
			{
			System.out.println("There is No Elements in The Array");
	
			}
			
			for(int i=0;i<Arr9.length;i++)
			{
				if(Arr9[i]>8.9)
				{
				System.out.println(Arr9[i]);
				}
						
			}

		
		}
	

}

class Assign8
{
	public static void main(String args[])throws Exception
	{
		
		//InputStreamReader IN=new InputStreamReader(System.in);
	BufferedReader BF=new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter Number Of Element For Array");		
		int No=Integer.parseInt(BF.readLine());		
		
		int Arr[]=new int[No];
					
		System.out.println("Enter The Array Element For Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=Integer.parseInt(BF.readLine());		

		}


		Arr obj=new Arr();
	
		System.out.println("Accept Array From User Display The Even Number From Array");	
		obj.fun21(Arr);
		System.out.println();		
		
		System.out.println("Accept Array From User Display The Additon of Even Number From Array");	
		int Ret1=obj.fun22(Arr);
		System.out.println("Addition Of Even Number:-"+Ret1);
		System.out.println();		
		

		System.out.println("Accept Array From User Display The Elements In Reverse Order");	
		obj.fun23(Arr);
		System.out.println();		
		

		System.out.println("Accept Array From User Display The All Prime Number From Array");	
		obj.fun24(Arr);
		System.out.println();		
		
		System.out.println("Accept Array From User Display The Count of each Number Of Array");	
		obj.fun25(Arr);
		System.out.println();	
	

		System.out.println("Accept Array From User Display The Additon of Each Number Of The Array");	
		System.out.println("Enter The Element For Array:--");
		No=Integer.parseInt(BF.readLine());					
		System.out.println("Enter The Array Element For Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=Integer.parseInt(BF.readLine());		

		}

		obj.fun26(Arr);
		System.out.println();		
				

		System.out.println("Accept Array From User Display Largest Element From Array");	
		System.out.println("Enter The Element For Array:--");
		No=Integer.parseInt(BF.readLine());		
		System.out.println("Enter The Array Element For Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=Integer.parseInt(BF.readLine());		

		}

		int Ret2=obj.fun27(Arr);
		System.out.println("Largest Element iS:-"+Ret2);
		System.out.println();		
			
		

		System.out.println("Accept Array From User Display Smallest Element From Array");	
		System.out.println("Enter The Element For Array:--");
		No=Integer.parseInt(BF.readLine());		
		
		System.out.println("Enter The Array Element For Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=Integer.parseInt(BF.readLine());		

		}
		int Ret3=obj.fun28(Arr);
		System.out.println("Smallest Element iS:-"+Ret3);
		System.out.println();		
		
		
		System.out.println("Accept The Float Array From User And Display The Elements Which Greater Than 8.9");
		System.out.println("Enter Number Of Elements For Array:--");
		No=Integer.parseInt(BF.readLine());

		float Brr[]=new float[No];

		System.out.println("Enetr The Element For Array:--");
		
		for(int j=0;j<No;j++)
		{
			Brr[j]=Float.parseFloat(BF.readLine());
		
		}
		System.out.println("Elements Which is Greater Than 8.9");
		obj.fun29(Brr);
		System.out.println();




	
	}

}















