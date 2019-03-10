import java.util.*;
class Demo
{
	
	void SelectionSort(int Arr[])
	{
		if(Arr==null)
		{
			System.out.println("There The No Element In Array");		
		}		
		int Temp=0,K=0,M=0;
		try
		{
			for(int i=0;i<Arr.length;i++)
			{
				M=i;
				K=i;
				for(int j=i;j<Arr.length;j++)
				{
					if(Arr[M]>Arr[j])
					{
						M=j;
					}	
				}
				Temp=Arr[K];
				Arr[K]=Arr[M];
				Arr[M]=Temp;				
			}	
		
		}
		catch(Exception e)
		{

			System.out.println(e);
	
		}
	}

}
class SelectionSort1
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
		obj.SelectionSort(Arr);

		System.out.println("After SelectionSort Method Call");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);			
		}
		

	}

}
