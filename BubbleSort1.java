import java.util.*;
class Demo
{
	
	void BubbleSort(int Arr[])
	{
		if(Arr==null)
		{
			System.out.println("There The No Element In Array");		
		}		

		int Temp=0;
		try
		{		
		for(int i=0;i<Arr.length;i++)
		{
			for(int j=0;j<Arr.length-i-1;j++)
			{
				if(Arr[j]>Arr[j+1])
				{
				Temp=Arr[j];		
				Arr[j]=Arr[j+1];
				Arr[j+1]=Temp;
				}

			}
	
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}



}



class BubbleSort
{
	public static void main(String args[])
	{
		
		Scanner SI=new Scanner(System.in);
		System.out.println("Enter Number Of Element For Array");		
		int No=SI.nextInt();		
	
		int Arr[]=new int[No];
		System.out.println("Enter Element For Sorting Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=SI.nextInt();			
		}

		Demo obj=new Demo();
		obj.BubbleSort(Arr);

		System.out.println("After BubbleSort Method Call");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);			
		}
		

		

	}

}
