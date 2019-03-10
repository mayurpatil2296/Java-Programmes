import java.util.*;

class Demo
{
	void InsertionSort(int Arr[])
	{
		if(Arr==null)
		{
			System.out.println("There Is N0 Element In Array");		
		}
		int j=0;
		int Key=0;

		for(int i=1;i<Arr.length;i++)
		{
			Key=Arr[i];
			j=i-1;
			
			while((j>=0)&&(Arr[j]>Key))
			{
				Arr[j+1]=Arr[j];
				j=j-1;
			}
			Arr[j+1]=Key;			
		}


	}



}

class InsertionSort
{
	public static void main(String args[])
	{
		Scanner SI=new Scanner(System.in);
		System.out.println("Enter Number OF Element For Array");
		int No=SI.nextInt();
		
		int Arr[]=new int[No];
		System.out.println("Enter Elements For Array");
		for(int i=0;i<No;i++)
		{
			Arr[i]=SI.nextInt();
		
		}
		
		Demo obj=new Demo();
		obj.InsertionSort(Arr);
		
		System.out.println("After InsertionSort Method Call");
		for(int i=0;i<Arr.length;i++)
		{
			System.out.println(Arr[i]);
		}
		
	}

}
